package r0;

import android.view.WindowInsets;
public abstract class k1 {
    public static int a(int i10) {
        int statusBars;
        int i11 = 0;
        for (int i12 = 1; i12 <= 512; i12 <<= 1) {
            if ((i10 & i12) != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 4) {
                            if (i12 != 8) {
                                if (i12 != 16) {
                                    if (i12 != 32) {
                                        if (i12 != 64) {
                                            if (i12 == 128) {
                                                statusBars = WindowInsets.Type.displayCutout();
                                            }
                                        } else {
                                            statusBars = WindowInsets.Type.tappableElement();
                                        }
                                    } else {
                                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                                    }
                                } else {
                                    statusBars = WindowInsets.Type.systemGestures();
                                }
                            } else {
                                statusBars = WindowInsets.Type.ime();
                            }
                        } else {
                            statusBars = WindowInsets.Type.captionBar();
                        }
                    } else {
                        statusBars = WindowInsets.Type.navigationBars();
                    }
                } else {
                    statusBars = WindowInsets.Type.statusBars();
                }
                i11 |= statusBars;
            }
        }
        return i11;
    }
}
