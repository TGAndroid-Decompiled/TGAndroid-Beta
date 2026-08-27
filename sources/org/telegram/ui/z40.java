package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

public final class z40 implements org.telegram.ui.Components.i40 {

    public float f45023a;

    public TLRPC.FileLocation f45024b;

    public TLRPC.FileLocation f45025c;
    public ImageLocation d;

    public final long f45026e;

    public final s50 f45027f;

    public z40(s50 s50Var, long j10) {
        this.f45027f = s50Var;
        this.f45026e = j10;
    }

    @Override
    public final void E(float f10) {
        this.f45027f.f42412b.O(this.d, f10);
        a(f10);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new oh.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f10) {
        this.f45023a = f10;
        y40 y40Var = this.f45027f.M;
        if (y40Var == null) {
            return;
        }
        for (int i10 = 0; i10 < y40Var.getChildCount(); i10++) {
            View childAt = y40Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.b4) {
                org.telegram.ui.Cells.b4 b4Var = (org.telegram.ui.Cells.b4) childAt;
                if (b4Var.c()) {
                    org.telegram.ui.Cells.w3 w3Var = b4Var.f24105x;
                    w3Var.setProgress(f10);
                    if (f10 < 1.0f) {
                        AndroidUtilities.updateViewVisibilityAnimated(w3Var, true, 1.0f, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(w3Var, false, 1.0f, true);
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
    public final cu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void P() {
    }

    @Override
    public final void J(boolean z10, boolean z11) {
    }
}
