package r0;

import android.view.WindowInsets;
public abstract class l1 {
    public static int a(int i9) {
        int statusBars;
        int i10 = 0;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i9 & i11) != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 4) {
                            if (i11 != 8) {
                                if (i11 != 16) {
                                    if (i11 != 32) {
                                        if (i11 != 64) {
                                            if (i11 != 128) {
                                                if (i11 == 512) {
                                                    statusBars = WindowInsets.Type.systemOverlays();
                                                }
                                            } else {
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
                i10 |= statusBars;
            }
        }
        return i10;
    }
}
