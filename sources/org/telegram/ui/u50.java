package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class u50 implements org.telegram.ui.Components.h50 {
    public float f40540a;
    public TLRPC.FileLocation f40541b;
    public TLRPC.FileLocation f40542c;
    public ImageLocation d;
    public final long e;
    public final n60 f40543f;

    public u50(n60 n60Var, long j10) {
        this.f40543f = n60Var;
        this.e = j10;
    }

    @Override
    public final void E(float f7) {
        this.f40543f.f38444b.O(this.d, f7);
        a(f7);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new gi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f7) {
        this.f40540a = f7;
        t50 t50Var = this.f40543f.Q;
        if (t50Var != null) {
            for (int i10 = 0; i10 < t50Var.getChildCount(); i10++) {
                View childAt = t50Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.e4) {
                    org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                    if (e4Var.c()) {
                        org.telegram.ui.Cells.z3 z3Var = e4Var.f21110x;
                        z3Var.setProgress(f7);
                        if (f7 < 1.0f) {
                            AndroidUtilities.updateViewVisibilityAnimated(z3Var, true, 1.0f, true);
                        } else {
                            AndroidUtilities.updateViewVisibilityAnimated(z3Var, false, 1.0f, true);
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
    public final kv0 getCloseIntoObject() {
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
