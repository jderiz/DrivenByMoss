// Written by Jürgen Moßgraber - mossgrabers.de
// (c) 2017-2021
// Licensed under LGPLv3 - http://www.gnu.org/licenses/lgpl-3.0.txt

package de.mossgrabers.framework.usb;

/**
 * Interface for a callback when an async transmission has finished.
 *
 * @author J&uuml;rgen Mo&szlig;graber
 */
public interface IUsbCallback
{
    /**
     * Called when ready to process the results.
     *
     * @param receivedLength The length of the received data, -1 if an error occured
     */
    void process (int receivedLength);
}
