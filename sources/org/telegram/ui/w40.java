package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class w40 implements org.telegram.ui.Components.d40 {
    public float f43663a;
    public TLRPC.FileLocation f43664b;
    public TLRPC.FileLocation f43665c;
    public ImageLocation d;
    public final long f43666e;
    public final o50 f43667f;

    public w40(o50 o50Var, long j10) {
        this.f43667f = o50Var;
        this.f43666e = j10;
    }

    @Override
    public final void D(float f10) {
        this.f43667f.f40883b.O(this.d, f10);
        a(f10);
    }

    @Override
    public final void P(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new nh.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f10) {
        this.f43663a = f10;
        u40 u40Var = this.f43667f.M;
        if (u40Var != null) {
            for (int i9 = 0; i9 < u40Var.getChildCount(); i9++) {
                View childAt = u40Var.getChildAt(i9);
                if (childAt instanceof org.telegram.ui.Cells.e4) {
                    org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                    if (e4Var.c()) {
                        org.telegram.ui.Cells.z3 z3Var = e4Var.f24298x;
                        z3Var.setProgress(f10);
                        if (f10 < 1.0f) {
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
    public final bu0 getCloseIntoObject() {
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
    public final void O() {
    }

    @Override
    public final void J(boolean z10, boolean z11) {
    }
}
