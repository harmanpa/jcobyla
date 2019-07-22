package com.cureos.numerics;

/**
 * The Options for the {@Link Cobyla} optimization.
 *
 * @author c.schmidt
 */
public class CobylaOptions {

    private final double rhobeg;
    private final double rhoend;
    private final int iprint;
    private final int maxfun;

    /**
     * The default constructor for the cobyla options
     */
    public CobylaOptions() {
        this(0.5, 1.0e-6, 1, 3500);
    }

    /**
     * The constructor for the cobyla options.
     *
     * @param rhobeg Initial size of the simplex.
     * @param rhoend Final value of the simplex.
     * @param iprint Print level, 0 &lt;= iprint &lt;= 3, where 0 provides no
     * output and 3 provides full output to the console.
     * @param maxfun Maximum number of function evaluations before terminating.
     */
    public CobylaOptions(double rhobeg, double rhoend, int iprint, int maxfun) {
        this.rhobeg = rhobeg;
        this.rhoend = rhoend;
        this.iprint = iprint;
        this.maxfun = maxfun;
    }

    /**
     * To get the rhoberg value.
     *
     * @return the rhoberg value.
     */
    public double getRhobeg() {
        return rhobeg;
    }

    /**
     * To get the rhoend value.
     *
     * @return the rhoend value.
     */
    public double getRhoend() {
        return rhoend;
    }

    /**
     * To get the iPrint value.
     *
     * @return the iPrint value.
     */
    public int getIprint() {
        return iprint;
    }

    /**
     * To get the number of function calls.
     *
     * @return the max number of function calls.
     */
    public int getMaxfun() {
        return maxfun;
    }
}
