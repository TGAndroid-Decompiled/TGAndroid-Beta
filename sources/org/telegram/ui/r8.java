package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r8 implements RequestDelegate {
    public final int f37031a;
    public final n9 f37032b;
    public final org.telegram.ui.ActionBar.c2 f37033c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage e;
    public final boolean f37034f;

    public r8(n9 n9Var, org.telegram.ui.ActionBar.c2 c2Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, int i10) {
        this.f37031a = i10;
        this.f37032b = n9Var;
        this.f37033c = c2Var;
        this.d = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.f37034f = z10;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37031a) {
            case 0:
                final n9 n9Var = this.f37032b;
                final org.telegram.ui.ActionBar.c2 c2Var = this.f37033c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.e;
                final boolean z10 = this.f37034f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                n9.W(n9Var, c2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                            default:
                                n9.a0(n9Var, c2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final n9 n9Var2 = this.f37032b;
                final org.telegram.ui.ActionBar.c2 c2Var2 = this.f37033c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.e;
                final boolean z11 = this.f37034f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                n9.W(n9Var2, c2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                            default:
                                n9.a0(n9Var2, c2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
