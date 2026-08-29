package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class y40 implements org.telegram.ui.Components.r40 {
    public float f44738a;
    public TLRPC.FileLocation f44739b;
    public TLRPC.FileLocation f44740c;
    public ImageLocation d;
    public final long f44741e;
    public final r50 f44742f;

    public y40(r50 r50Var, long j10) {
        this.f44742f = r50Var;
        this.f44741e = j10;
    }

    @Override
    public final void D(float f9) {
        this.f44742f.f41871b.O(this.d, f9);
        a(f9);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new wc(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 2));
    }

    public final void a(float f9) {
        this.f44738a = f9;
        x40 x40Var = this.f44742f.M;
        if (x40Var != null) {
            for (int i10 = 0; i10 < x40Var.getChildCount(); i10++) {
                View childAt = x40Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.c4) {
                    org.telegram.ui.Cells.c4 c4Var = (org.telegram.ui.Cells.c4) childAt;
                    if (c4Var.c()) {
                        org.telegram.ui.Cells.w3 w3Var = c4Var.f24162x;
                        w3Var.setProgress(f9);
                        if (f9 < 1.0f) {
                            AndroidUtilities.updateViewVisibilityAnimated(w3Var, true, 1.0f, true);
                        } else {
                            AndroidUtilities.updateViewVisibilityAnimated(w3Var, false, 1.0f, true);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final zt0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void P() {
    }

    @Override
    public final void K(boolean z10, boolean z11) {
    }
}
