package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class w21 extends FrameLayout implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.is {
    public final org.telegram.ui.Components.i9 f52368a;
    public final org.telegram.ui.ActionBar.l2 f52369b;
    public final org.telegram.ui.Components.voip.n f52370c;
    public int d;
    public int f52371e;
    public final SessionsActivity f52372f;

    public w21(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.f52372f = sessionsActivity;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f52370c = nVar;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f52368a = i9Var;
        addView(i9Var, c8.ja.d(120, 120.0f, 1, 0.0f, 16.0f, 0.0f, 0.0f));
        nVar.f40798j = false;
        nVar.f40802n = 1.2f;
        i9Var.setOnClickListener(new a8(this, 2));
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        int i10 = org.telegram.ui.ActionBar.j6.f28849d6;
        org.telegram.ui.ActionBar.j6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.j6.Fi;
        org.telegram.ui.ActionBar.j6.x0(null, i11, false);
        org.telegram.ui.ActionBar.j6.x0(null, i10, false);
        org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(context, null);
        addView(z70Var, c8.ja.d(-1, -2.0f, 0, 36.0f, 152.0f, 36.0f, 0.0f));
        z70Var.setGravity(1);
        org.telegram.ui.ActionBar.q6.U(z70Var, i7, null);
        z70Var.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.J6, null);
        org.telegram.ui.ActionBar.q6.C(z70Var, org.telegram.ui.ActionBar.j6.K6, null);
        String M0 = org.telegram.messenger.hd.M0(2131753889, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf(42);
        int i12 = indexOf + 1;
        int indexOf2 = M0.indexOf(42, i12);
        if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
            z70Var.setMovementMethod(new org.telegram.messenger.c0(false));
            spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, i12, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.f41(org.telegram.messenger.hd.M0(2131753893, null), (org.telegram.ui.Components.wy0) null), indexOf, indexOf2 - 1, 33);
        }
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf3 = spannableStringBuilder2.indexOf(42);
        int i13 = indexOf3 + 1;
        int indexOf4 = spannableStringBuilder2.indexOf(42, i13);
        if (indexOf3 != -1 && indexOf4 != -1 && indexOf3 != indexOf4) {
            z70Var.setMovementMethod(new org.telegram.messenger.c0(false));
            spannableStringBuilder.replace(indexOf4, indexOf4 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf3, i13, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.f41(org.telegram.messenger.hd.M0(2131753883, null), (org.telegram.ui.Components.wy0) null), indexOf3, indexOf4 - 1, 33);
        }
        z70Var.setText(spannableStringBuilder);
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2(6, context, this);
        this.f52369b = l2Var;
        l2Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        l2Var.setGravity(17);
        l2Var.setTextSize(1, 14.0f);
        l2Var.setTypeface(org.telegram.messenger.g0.o());
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) ".  ").append((CharSequence) org.telegram.messenger.hd.M0(2131748917, null));
        spannableStringBuilder3.setSpan(new org.telegram.ui.Components.eq(0, getContext().getDrawable(2131232247)), 0, 1, 0);
        l2Var.setText(spannableStringBuilder3);
        org.telegram.ui.ActionBar.q6.U(l2Var, org.telegram.ui.ActionBar.j6.Ji, null);
        int L = org.telegram.messenger.g0.L(24.0f);
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i11, false);
        int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hi, false);
        l2Var.setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, x02, x03, x03));
        l2Var.setOnClickListener(new ky0(this, 6));
        addView(l2Var, c8.ja.d(-1, 48.0f, 80, 16.0f, 15.0f, 16.0f, 16.0f));
        a();
    }

    public final void a() {
        int i7;
        TLRPC.Document document;
        int i10;
        boolean z10;
        int i11;
        SessionsActivity sessionsActivity = this.f52372f;
        i7 = ((org.telegram.ui.ActionBar.e2) sessionsActivity).currentAccount;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.si.b0(i7).p0("tg_placeholders_android");
        if (p02 == null) {
            i11 = ((org.telegram.ui.ActionBar.e2) sessionsActivity).currentAccount;
            p02 = org.telegram.messenger.si.b0(i11).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        org.telegram.messenger.pz pzVar = null;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() > 6) {
            document = tL_messages_stickerSet.documents.get(6);
        } else {
            document = null;
        }
        if (document != null) {
            pzVar = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.j6.f28832c7, 0.2f, false);
        }
        org.telegram.messenger.pz pzVar2 = pzVar;
        if (pzVar2 != null) {
            pzVar2.f26029e = 512;
            pzVar2.f26030f = 512;
        }
        if (document == null) {
            i10 = ((org.telegram.ui.ActionBar.e2) sessionsActivity).currentAccount;
            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i10);
            if (tL_messages_stickerSet == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            b02.c1("tg_placeholders_android", false, z10);
            return;
        }
        org.telegram.messenger.gc b10 = org.telegram.messenger.gc.b(document);
        org.telegram.ui.Components.i9 i9Var = this.f52368a;
        i9Var.k(b10, "130_130", "tgs", pzVar2, tL_messages_stickerSet);
        i9Var.getImageReceiver().W(2);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25607y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i7;
        super.onAttachedToWindow();
        a();
        i7 = ((org.telegram.ui.ActionBar.e2) this.f52372f).currentAccount;
        org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.f25607y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i7;
        super.onDetachedFromWindow();
        i7 = ((org.telegram.ui.ActionBar.e2) this.f52372f).currentAccount;
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.f25607y0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(276.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false);
            int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hi, false);
            org.telegram.ui.ActionBar.l2 l2Var = this.f52369b;
            if (l2Var != null) {
                if (x02 == this.d) {
                    if (x03 != this.f52371e) {
                    }
                }
                this.d = x02;
                this.f52371e = x03;
                int L = org.telegram.messenger.g0.L(24.0f);
                l2Var.setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, x02, x03, x03));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
