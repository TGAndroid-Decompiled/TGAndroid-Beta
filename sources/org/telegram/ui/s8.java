package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s8 implements RequestDelegate {
    public final int f43380a;
    public final o9 f43381b;
    public final org.telegram.ui.ActionBar.e2 f43382c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage e;
    public final boolean f43383f;

    public s8(o9 o9Var, org.telegram.ui.ActionBar.e2 e2Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, int i10) {
        this.f43380a = i10;
        this.f43381b = o9Var;
        this.f43382c = e2Var;
        this.d = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.f43383f = z10;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f43380a) {
            case 0:
                final o9 o9Var = this.f43381b;
                final org.telegram.ui.ActionBar.e2 e2Var = this.f43382c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.e;
                final boolean z10 = this.f43383f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                o9.X(o9Var, e2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                            default:
                                o9.Y(o9Var, e2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final o9 o9Var2 = this.f43381b;
                final org.telegram.ui.ActionBar.e2 e2Var2 = this.f43382c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.e;
                final boolean z11 = this.f43383f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                o9.X(o9Var2, e2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                            default:
                                o9.Y(o9Var2, e2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
