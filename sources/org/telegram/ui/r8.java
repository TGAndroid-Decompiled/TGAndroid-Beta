package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r8 implements RequestDelegate {
    public final int f39372a;
    public final n9 f39373b;
    public final org.telegram.ui.ActionBar.a2 f39374c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage e;
    public final boolean f39375f;

    public r8(n9 n9Var, org.telegram.ui.ActionBar.a2 a2Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, int i10) {
        this.f39372a = i10;
        this.f39373b = n9Var;
        this.f39374c = a2Var;
        this.d = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.f39375f = z10;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39372a) {
            case 0:
                final n9 n9Var = this.f39373b;
                final org.telegram.ui.ActionBar.a2 a2Var = this.f39374c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.e;
                final boolean z10 = this.f39375f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                n9.V(n9Var, a2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                            default:
                                n9.Y(n9Var, a2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final n9 n9Var2 = this.f39373b;
                final org.telegram.ui.ActionBar.a2 a2Var2 = this.f39374c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.e;
                final boolean z11 = this.f39375f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                n9.V(n9Var2, a2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                            default:
                                n9.Y(n9Var2, a2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
