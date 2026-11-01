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
public final class qt0 extends org.telegram.ui.ActionBar.k2 {
    public final long f40899a;
    public org.telegram.ui.Cells.x7 f40900b;
    public org.telegram.ui.Components.j80 f40901c;
    public org.telegram.ui.Components.v51 d;
    public org.telegram.ui.ActionBar.l5 e;
    public final boolean f40902f;
    public final long h;
    public boolean f40903n;
    public long f40904r;
    public go f40905s;
    public boolean f40906w;

    public qt0(long j10) {
        super(null);
        TLRPC.Chat chat = null;
        boolean z10 = true;
        this.f40906w = true;
        this.f40899a = j10;
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j10));
        if (L0 != null && L0.linked_monoforum_id != 0) {
            chat = getMessagesController().L0(Long.valueOf(L0.linked_monoforum_id));
        }
        long j11 = chat != null ? chat.send_paid_messages_stars : 0L;
        z10 = (L0 == null || !L0.broadcast_messages_allowed) ? false : false;
        this.f40902f = z10;
        long k10 = Utilities.k(z10 ? j11 : ((org.telegram.messenger.l0) getMessagesController().f19300y7.f18019b.f10701a).f16855c, getMessagesController().J6, 0L);
        this.h = k10;
        this.f40903n = z10;
        this.f40904r = k10;
    }

    public static void Z(qt0 qt0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        long j10;
        if (tL_error != null) {
            qt0Var.e.b(false);
            org.telegram.ui.Components.cc.d0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        qt0Var.getMessagesController().P3(updates.chats, false);
        qt0Var.getMessagesController().L3(updates, false);
        if (!qt0Var.isFinished && !qt0Var.finishing) {
            go goVar = qt0Var.f40905s;
            if (goVar != null) {
                if (updatepaidmessagesprice.suggestions_allowed) {
                    j10 = updatepaidmessagesprice.send_paid_messages_stars;
                } else {
                    j10 = -1;
                }
                goVar.run(j10);
            }
            qt0Var.finishFragment();
        }
    }

    public final void a0(boolean z10) {
        boolean c02;
        if (this.e == null || this.f40906w == (c02 = c0())) {
            return;
        }
        this.f40906w = c02;
        this.e.a(c02, z10);
    }

    public final String b0() {
        int i10 = getMessagesController().K6;
        return org.telegram.messenger.dd.a0(null, null, 2131747088, xh.i.J0(i10), String.valueOf(((int) (((((float) this.f40904r) * (i10 / 1000.0f)) / 1000.0d) * getMessagesController().f19111d6)) / 100.0d));
    }

    public final boolean c0() {
        if (this.f40904r == this.h && this.f40903n == this.f40902f) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131747111, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s60(this, 18));
        this.e = this.simpleActionBar.n(org.telegram.messenger.dd.L0(2131745963, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20873a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.x7 x7Var = new org.telegram.ui.Cells.x7(context, this.resourceProvider);
        this.f40900b = x7Var;
        int i10 = org.telegram.ui.ActionBar.t6.f20930d6;
        org.telegram.ui.ActionBar.a7.i(i10, x7Var, getResourceProvider());
        org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(context, this, null, true, true);
        this.f40901c = j80Var;
        j80Var.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), 0);
        org.telegram.ui.ActionBar.a7.i(i10, this.f40901c, getResourceProvider());
        this.f40901c.b(true);
        this.f40901c.d(0, null, false);
        org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(context, this.currentAccount, this.classGuid, false, new z4(this, 16), new pt0(this, 2), null, this.resourceProvider);
        this.d = v51Var;
        v51Var.r1();
        frameLayout2.addView(this.d, w7.b6.e(-1, -1, 51));
        return this.fragmentView;
    }

    public final void d0() {
        long j10;
        long j11;
        if (!this.e.f20548y.f7022f) {
            if (!c0()) {
                finishFragment();
                return;
            }
            this.e.b(true);
            TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
            org.telegram.messenger.wp messagesController = getMessagesController();
            long j12 = this.f40899a;
            updatepaidmessagesprice.channel = messagesController.g1(j12);
            boolean z10 = this.f40903n;
            if (z10) {
                j10 = this.f40904r;
            } else {
                j10 = 0;
            }
            updatepaidmessagesprice.send_paid_messages_stars = j10;
            updatepaidmessagesprice.suggestions_allowed = z10;
            getConnectionsManager().sendRequest(updatepaidmessagesprice, new sl0(2, this, updatepaidmessagesprice));
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j12));
            if (L0 != null) {
                if (this.f40903n) {
                    L0.flags2 |= 65536;
                    L0.broadcast_messages_allowed = true;
                } else {
                    L0.flags2 &= -65537;
                    L0.broadcast_messages_allowed = false;
                }
                getMessagesController().N3(L0, true);
                TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(L0.linked_monoforum_id));
                if (L02 != null) {
                    if (this.f40903n) {
                        L02.flags2 |= 16384;
                        L02.send_paid_messages_stars = this.f40904r;
                    } else {
                        L02.flags2 &= -16385;
                        L02.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().N3(L02, true);
                }
            }
            go goVar = this.f40905s;
            if (goVar != null) {
                if (this.f40903n) {
                    j11 = this.f40904r;
                } else {
                    j11 = -1;
                }
                goVar.run(j11);
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
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
                String L0 = org.telegram.messenger.dd.L0(2131743860, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.dd.L0(2131748485, null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131754216, null), new pt0(this, 0));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131751407, null), new pt0(this, 1));
                showDialog(x1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.q51 q51Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.v51 v51Var = this.d;
        if (v51Var != null && (q51Var = v51Var.f31183f3) != null) {
            q51Var.O(false);
            return true;
        }
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
