package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s8 implements RequestDelegate {
    public final int f38120a;
    public final n9 f38121b;
    public final org.telegram.ui.ActionBar.d2 f38122c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage e;
    public final boolean f38123f;

    public s8(n9 n9Var, org.telegram.ui.ActionBar.d2 d2Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z4, int i10) {
        this.f38120a = i10;
        this.f38121b = n9Var;
        this.f38122c = d2Var;
        this.d = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.f38123f = z4;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f38120a) {
            case 0:
                final n9 n9Var = this.f38121b;
                final org.telegram.ui.ActionBar.d2 d2Var = this.f38122c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.e;
                final boolean z4 = this.f38123f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                n9.V(n9Var, d2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z4, tL_error);
                                return;
                            default:
                                n9.Y(n9Var, d2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z4, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final n9 n9Var2 = this.f38121b;
                final org.telegram.ui.ActionBar.d2 d2Var2 = this.f38122c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.e;
                final boolean z10 = this.f38123f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                n9.V(n9Var2, d2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z10, tL_error);
                                return;
                            default:
                                n9.Y(n9Var2, d2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z10, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
