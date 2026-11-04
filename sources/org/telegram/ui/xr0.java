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
public final class xr0 extends org.telegram.ui.ActionBar.d2 {
    public final long f52082a;
    public org.telegram.ui.Cells.s7 f52083b;
    public org.telegram.ui.Components.m70 f52084c;
    public org.telegram.ui.Components.l41 d;
    public org.telegram.ui.ActionBar.b5 f52085e;
    public final boolean f52086f;
    public final long h;
    public boolean f52087n;
    public long f52088r;
    public gn f52089s;
    public boolean f52090w;

    public xr0(long j10) {
        super(null);
        TLRPC.Chat chat = null;
        boolean z10 = true;
        this.f52090w = true;
        this.f52082a = j10;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j10));
        if (M0 != null && M0.linked_monoforum_id != 0) {
            chat = getMessagesController().M0(Long.valueOf(M0.linked_monoforum_id));
        }
        long j11 = chat != null ? chat.send_paid_messages_stars : 0L;
        z10 = (M0 == null || !M0.broadcast_messages_allowed) ? false : false;
        this.f52086f = z10;
        long k10 = Utilities.k(z10 ? j11 : ((org.telegram.messenger.j0) getMessagesController().f23167x7.f24647b.f13798b).f23620c, getMessagesController().I6, 0L);
        this.h = k10;
        this.f52087n = z10;
        this.f52088r = k10;
    }

    public static void Z(xr0 xr0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        long j10;
        if (tL_error != null) {
            xr0Var.f52085e.b(false);
            org.telegram.ui.Components.fc.d0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        xr0Var.getMessagesController().S3(updates.chats, false);
        xr0Var.getMessagesController().O3(updates, false);
        if (!xr0Var.isFinished && !xr0Var.finishing) {
            gn gnVar = xr0Var.f52089s;
            if (gnVar != null) {
                if (updatepaidmessagesprice.suggestions_allowed) {
                    j10 = updatepaidmessagesprice.send_paid_messages_stars;
                } else {
                    j10 = -1;
                }
                gnVar.run(j10);
            }
            xr0Var.finishFragment();
        }
    }

    public final void a0(boolean z10) {
        boolean c02;
        if (this.f52085e == null || this.f52090w == (c02 = c0())) {
            return;
        }
        this.f52090w = c02;
        this.f52085e.a(c02, z10);
    }

    public final String b0() {
        int i3 = getMessagesController().J6;
        return org.telegram.messenger.bd.a0(null, null, 2131747081, ii.k.J0(i3), String.valueOf(((int) (((((float) this.f52088r) * (i3 / 1000.0f)) / 1000.0d) * getMessagesController().f22979c6)) / 100.0d));
    }

    public final boolean c0() {
        if (this.f52088r == this.h && this.f52087n == this.f52086f) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747104, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 28));
        this.f52085e = this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27824a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.resourceProvider);
        this.f52083b = s7Var;
        int i3 = org.telegram.ui.ActionBar.k6.f27878d6;
        org.telegram.ui.ActionBar.r6.i(i3, s7Var, getResourceProvider());
        org.telegram.ui.Components.m70 m70Var = new org.telegram.ui.Components.m70(context, this, null, true, true);
        this.f52084c = m70Var;
        m70Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), 0);
        org.telegram.ui.ActionBar.r6.i(i3, this.f52084c, getResourceProvider());
        this.f52084c.b(true);
        this.f52084c.d(0, null, false);
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(context, this.currentAccount, this.classGuid, false, new c5(this, 16), new wr0(this, 2), null, this.resourceProvider);
        this.d = l41Var;
        l41Var.r1();
        frameLayout2.addView(this.d, b8.mf.e(-1, -1, 51));
        return this.fragmentView;
    }

    public final void d0() {
        long j10;
        long j11;
        if (!this.f52085e.f27421y.f53841f) {
            if (!c0()) {
                finishFragment();
                return;
            }
            this.f52085e.b(true);
            TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
            org.telegram.messenger.hp messagesController = getMessagesController();
            long j12 = this.f52082a;
            updatepaidmessagesprice.channel = messagesController.h1(j12);
            boolean z10 = this.f52087n;
            if (z10) {
                j10 = this.f52088r;
            } else {
                j10 = 0;
            }
            updatepaidmessagesprice.send_paid_messages_stars = j10;
            updatepaidmessagesprice.suggestions_allowed = z10;
            getConnectionsManager().sendRequest(updatepaidmessagesprice, new xy(21, this, updatepaidmessagesprice));
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j12));
            if (M0 != null) {
                if (this.f52087n) {
                    M0.flags2 |= 65536;
                    M0.broadcast_messages_allowed = true;
                } else {
                    M0.flags2 &= -65537;
                    M0.broadcast_messages_allowed = false;
                }
                getMessagesController().Q3(M0, true);
                TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(M0.linked_monoforum_id));
                if (M02 != null) {
                    if (this.f52087n) {
                        M02.flags2 |= 16384;
                        M02.send_paid_messages_stars = this.f52088r;
                    } else {
                        M02.flags2 &= -16385;
                        M02.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().Q3(M02, true);
                }
            }
            gn gnVar = this.f52089s;
            if (gnVar != null) {
                if (this.f52087n) {
                    j11 = this.f52088r;
                } else {
                    j11 = -1;
                }
                gnVar.run(j11);
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !c0();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (c0()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.bd.M0(2131743845, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131748478, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754216, null), new wr0(this, 0));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751407, null), new wr0(this, 1));
                showDialog(s1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.f41 f41Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.l41 l41Var = this.d;
        if (l41Var != null && (f41Var = l41Var.f35594g3) != null) {
            f41Var.O(false);
            return true;
        }
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
