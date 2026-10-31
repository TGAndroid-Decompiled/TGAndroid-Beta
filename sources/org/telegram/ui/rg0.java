package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rg0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final ArrayList f41221a;
    public final ArrayList f41222b;
    public final ArrayList f41223c;
    public final org.telegram.ui.Components.u8 d;
    public final org.telegram.ui.ActionBar.u5 e;
    public final int f41224f;
    public final boolean h;
    public final org.telegram.ui.Components.zz f41225n;
    public boolean f41226r;
    public w71 f41227s;
    public int f41228w;

    public rg0(Context context, int i10, org.telegram.messenger.jj jjVar, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        int i11;
        long j10;
        this.f41221a = new ArrayList();
        this.f41222b = new ArrayList();
        this.f41223c = new ArrayList();
        this.f41224f = i10;
        if (!jjVar.h4() && !org.telegram.messenger.jj.R4(jjVar.f16337k)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.h = z10;
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        this.f41225n = zzVar;
        zzVar.e(org.telegram.ui.ActionBar.t6.G8, org.telegram.ui.ActionBar.t6.f21020i6, -1);
        zzVar.setViewType(13);
        zzVar.setIsSingleCell(false);
        addView(zzVar, w7.b6.c(-1.0f, -2));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.e = u5Var;
        u5Var.setTextSize(16);
        u5Var.setEllipsizeByGradient(true);
        u5Var.setRightPadding(org.telegram.messenger.i0.L(62.0f));
        addView(u5Var, w7.b6.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(context, false);
        this.d = u8Var;
        u8Var.setStyle(11);
        u8Var.setAvatarsTextSize(org.telegram.messenger.i0.L(22.0f));
        addView(u8Var, w7.b6.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.E8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = jjVar.f1();
        tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.vp.r1(i10).i1(org.telegram.messenger.jj.B0(jjVar.f16337k));
        ImageView imageView = new ImageView(context);
        addView(imageView, w7.b6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            i11 = 2131232297;
        } else {
            i11 = 2131232355;
        }
        Drawable mutate = context.getDrawable(i11).mutate();
        org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        u8Var.setAlpha(0.0f);
        u5Var.setAlpha(0.0f);
        TLRPC.Peer peer = jjVar.f16337k.from_id;
        if (peer != null) {
            j10 = peer.user_id;
        } else {
            j10 = 0;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new org.telegram.ui.Components.o2(this, j10, i10, chat));
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.I5, false);
        this.f41228w = x02;
        setBackground(org.telegram.ui.ActionBar.t6.a0(x02, 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.tk0 a() {
        w71 w71Var = this.f41227s;
        if (w71Var != null) {
            return w71Var;
        }
        w71 w71Var2 = new w71(8, getContext(), null);
        this.f41227s = w71Var2;
        getContext();
        w71Var2.setLayoutManager(new s4.a0());
        this.f41227s.i(new mg.u1(this, 6));
        this.f41227s.setAdapter(new kg.f(this, 6));
        return this.f41227s;
    }

    public final void b() {
        boolean z10;
        org.telegram.ui.Components.u8 u8Var;
        String str;
        ArrayList arrayList = this.f41223c;
        if (arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setEnabled(z10);
        int i10 = 0;
        while (true) {
            u8Var = this.d;
            if (i10 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i11 = this.f41224f;
            if (i10 < size) {
                u8Var.b(i10, i11, (TLObject) arrayList.get(i10));
            } else {
                u8Var.b(i10, i11, null);
            }
            i10++;
        }
        if (arrayList.size() == 1) {
            u8Var.setTranslationX(org.telegram.messenger.i0.L(24.0f));
        } else if (arrayList.size() == 2) {
            u8Var.setTranslationX(org.telegram.messenger.i0.L(12.0f));
        } else {
            u8Var.setTranslationX(0.0f);
        }
        int L = org.telegram.messenger.i0.L((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.u5 u5Var = this.e;
        u5Var.setRightPadding(L);
        u8Var.a(false);
        ArrayList arrayList2 = this.f41221a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            u5Var.l(org.telegram.messenger.i5.o((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            u5Var.l(org.telegram.messenger.cd.L0(2131748140, null), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            u5Var.l(org.telegram.messenger.cd.G(arrayList2.size(), str, new Object[0]), false);
        }
        u5Var.animate().alpha(1.0f).setDuration(220L).start();
        u8Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.zz zzVar = this.f41225n;
        zzVar.animate().alpha(0.0f).setDuration(220L).setListener(new eg.m(zzVar)).start();
        w71 w71Var = this.f41227s;
        if (w71Var != null) {
            w71Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z10 = true;
        this.f41226r = true;
        org.telegram.ui.Components.zz zzVar = this.f41225n;
        if (zzVar.getVisibility() != 0) {
            z10 = false;
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.e;
        u5Var.setVisibility(8);
        if (z10) {
            zzVar.setVisibility(8);
        }
        super.onMeasure(i10, i11);
        if (z10) {
            zzVar.getLayoutParams().width = getMeasuredWidth();
            zzVar.setVisibility(0);
        }
        u5Var.setVisibility(0);
        u5Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.i0.L(40.0f);
        this.f41226r = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f41226r) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.I5, false);
            if (getBackground() != null && x02 != this.f41228w) {
                this.f41228w = x02;
                org.telegram.ui.ActionBar.t6.H1(getBackground(), x02, true);
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
