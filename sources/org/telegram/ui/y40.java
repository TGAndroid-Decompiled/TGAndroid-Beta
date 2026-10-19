package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class y40 implements org.telegram.ui.Components.d50 {
    public float f43342a;
    public TLRPC.FileLocation f43343b;
    public TLRPC.FileLocation f43344c;
    public ImageLocation d;
    public final long e;
    public final q50 f43345f;

    public y40(q50 q50Var, long j10) {
        this.f43345f = q50Var;
        this.e = j10;
    }

    @Override
    public final void E(float f7) {
        this.f43345f.f40372b.O(this.d, f7);
        a(f7);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new hi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f7) {
        this.f43342a = f7;
        w40 w40Var = this.f43345f.Q;
        if (w40Var != null) {
            for (int i10 = 0; i10 < w40Var.getChildCount(); i10++) {
                View childAt = w40Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.d4) {
                    org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                    if (d4Var.c()) {
                        org.telegram.ui.Cells.y3 y3Var = d4Var.f22131x;
                        y3Var.setProgress(f7);
                        if (f7 < 1.0f) {
                            AndroidUtilities.updateViewVisibilityAnimated(y3Var, true, 1.0f, true);
                        } else {
                            AndroidUtilities.updateViewVisibilityAnimated(y3Var, false, 1.0f, true);
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
    public final ju0 getCloseIntoObject() {
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
    public final void K(boolean z10, boolean z11) {
    }
}
