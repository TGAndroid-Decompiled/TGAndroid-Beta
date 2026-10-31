package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rt0 extends org.telegram.ui.ActionBar.k2 {
    public final long f41287a;
    public org.telegram.ui.Cells.x7 f41288b;
    public org.telegram.ui.Components.j80 f41289c;
    public org.telegram.ui.Components.u51 d;
    public org.telegram.ui.ActionBar.l5 e;
    public final boolean f41290f;
    public final long h;
    public boolean f41291n;
    public long f41292r;
    public go f41293s;
    public boolean f41294w;

    public rt0(long j10) {
        super(null);
        TLRPC.Chat chat = null;
        boolean z10 = true;
        this.f41294w = true;
        this.f41287a = j10;
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j10));
        if (L0 != null && L0.linked_monoforum_id != 0) {
            chat = getMessagesController().L0(Long.valueOf(L0.linked_monoforum_id));
        }
        long j11 = chat != null ? chat.send_paid_messages_stars : 0L;
        z10 = (L0 == null || !L0.broadcast_messages_allowed) ? false : false;
        this.f41290f = z10;
        long k10 = Utilities.k(z10 ? j11 : ((org.telegram.messenger.l0) getMessagesController().f18957y7.f17827b.f10700a).f16658c, getMessagesController().J6, 0L);
        this.h = k10;
        this.f41291n = z10;
        this.f41292r = k10;
    }

    public static void Y(rt0 rt0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        long j10;
        if (tL_error != null) {
            rt0Var.e.b(false);
            org.telegram.ui.Components.cc.d0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        rt0Var.getMessagesController().P3(updates.chats, false);
        rt0Var.getMessagesController().L3(updates, false);
        if (!rt0Var.isFinished && !rt0Var.finishing) {
            go goVar = rt0Var.f41293s;
            if (goVar != null) {
                if (updatepaidmessagesprice.suggestions_allowed) {
                    j10 = updatepaidmessagesprice.send_paid_messages_stars;
                } else {
                    j10 = -1;
                }
                goVar.run(j10);
            }
            rt0Var.finishFragment();
        }
    }

    public final void Z(boolean z10) {
        boolean b02;
        if (this.e == null || this.f41294w == (b02 = b0())) {
            return;
        }
        this.f41294w = b02;
        this.e.a(b02, z10);
    }

    public final String a0() {
        int i10 = getMessagesController().K6;
        return org.telegram.messenger.cd.a0(null, null, 2131747088, xh.i.I0(i10), String.valueOf(((int) (((((float) this.f41292r) * (i10 / 1000.0f)) / 1000.0d) * getMessagesController().f18768d6)) / 100.0d));
    }

    public final boolean b0() {
        if (this.f41292r == this.h && this.f41291n == this.f41290f) {
            return false;
        }
        return true;
    }

    public final void c0() {
        long j10;
        long j11;
        if (!this.e.f20547y.f7021f) {
            if (!b0()) {
                finishFragment();
                return;
            }
            this.e.b(true);
            TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
            org.telegram.messenger.vp messagesController = getMessagesController();
            long j12 = this.f41287a;
            updatepaidmessagesprice.channel = messagesController.g1(j12);
            boolean z10 = this.f41291n;
            if (z10) {
                j10 = this.f41292r;
            } else {
                j10 = 0;
            }
            updatepaidmessagesprice.send_paid_messages_stars = j10;
            updatepaidmessagesprice.suggestions_allowed = z10;
            getConnectionsManager().sendRequest(updatepaidmessagesprice, new ul0(2, this, updatepaidmessagesprice));
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j12));
            if (L0 != null) {
                if (this.f41291n) {
                    L0.flags2 |= 65536;
                    L0.broadcast_messages_allowed = true;
                } else {
                    L0.flags2 &= -65537;
                    L0.broadcast_messages_allowed = false;
                }
                getMessagesController().N3(L0, true);
                TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(L0.linked_monoforum_id));
                if (L02 != null) {
                    if (this.f41291n) {
                        L02.flags2 |= 16384;
                        L02.send_paid_messages_stars = this.f41292r;
                    } else {
                        L02.flags2 &= -16385;
                        L02.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().N3(L02, true);
                }
            }
            go goVar = this.f41293s;
            if (goVar != null) {
                if (this.f41291n) {
                    j11 = this.f41292r;
                } else {
                    j11 = -1;
                }
                goVar.run(j11);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131747111, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 18));
        this.e = this.simpleActionBar.n(org.telegram.messenger.cd.L0(2131745963, null));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20872a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.x7 x7Var = new org.telegram.ui.Cells.x7(context, this.resourceProvider);
        this.f41288b = x7Var;
        int i10 = org.telegram.ui.ActionBar.t6.f20929d6;
        org.telegram.ui.ActionBar.a7.i(i10, x7Var, getResourceProvider());
        org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(context, this, null, true, true);
        this.f41289c = j80Var;
        j80Var.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), 0);
        org.telegram.ui.ActionBar.a7.i(i10, this.f41289c, getResourceProvider());
        this.f41289c.b(true);
        this.f41289c.d(0, null, false);
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(context, this.currentAccount, this.classGuid, false, new z4(this, 16), new qt0(this, 2), null, this.resourceProvider);
        this.d = u51Var;
        u51Var.r1();
        frameLayout2.addView(this.d, w7.b6.e(-1, -1, 51));
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !b0();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (b0()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String L0 = org.telegram.messenger.cd.L0(2131743860, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.cd.L0(2131748485, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754216, null), new qt0(this, 0));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751407, null), new qt0(this, 1));
                showDialog(x1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.p51 p51Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.u51 u51Var = this.d;
        if (u51Var != null && (p51Var = u51Var.f30819f3) != null) {
            p51Var.O(false);
            return true;
        }
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
