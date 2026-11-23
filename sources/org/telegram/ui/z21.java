package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class z21 extends FrameLayout implements org.telegram.ui.ActionBar.c6, org.telegram.messenger.fs {
    public final org.telegram.ui.Components.p9 f54502a;
    public final org.telegram.ui.ActionBar.n2 f54503b;
    public final org.telegram.ui.Components.voip.n f54504c;
    public int d;
    public int f54505e;
    public final SessionsActivity f54506f;

    public z21(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.f54506f = sessionsActivity;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f54504c = nVar;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f54502a = p9Var;
        addView(p9Var, c8.na.d(120, 120.0f, 1, 0.0f, 16.0f, 0.0f, 0.0f));
        nVar.f41077j = false;
        nVar.f41081n = 1.2f;
        p9Var.setOnClickListener(new b8(this, 2));
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        int i10 = org.telegram.ui.ActionBar.n6.f29451d6;
        org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        org.telegram.ui.ActionBar.n6.x0(null, i11, false);
        org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(context, null);
        addView(j80Var, c8.na.d(-1, -2.0f, 0, 36.0f, 152.0f, 36.0f, 0.0f));
        j80Var.setGravity(1);
        org.telegram.ui.ActionBar.u6.U(j80Var, i7, null);
        j80Var.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.J6, null);
        org.telegram.ui.ActionBar.u6.C(j80Var, org.telegram.ui.ActionBar.n6.K6, null);
        String N0 = org.telegram.messenger.gd.N0(2131753886, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
        int indexOf = N0.indexOf(42);
        int i12 = indexOf + 1;
        int indexOf2 = N0.indexOf(42, i12);
        if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
            j80Var.setMovementMethod(new org.telegram.messenger.c0(false));
            spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, i12, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.r41(org.telegram.messenger.gd.N0(2131753890, null), (org.telegram.ui.Components.ez0) null), indexOf, indexOf2 - 1, 33);
        }
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf3 = spannableStringBuilder2.indexOf(42);
        int i13 = indexOf3 + 1;
        int indexOf4 = spannableStringBuilder2.indexOf(42, i13);
        if (indexOf3 != -1 && indexOf4 != -1 && indexOf3 != indexOf4) {
            j80Var.setMovementMethod(new org.telegram.messenger.c0(false));
            spannableStringBuilder.replace(indexOf4, indexOf4 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf3, i13, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.r41(org.telegram.messenger.gd.N0(2131753880, null), (org.telegram.ui.Components.ez0) null), indexOf3, indexOf4 - 1, 33);
        }
        j80Var.setText(spannableStringBuilder);
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(6, context, this);
        this.f54503b = n2Var;
        n2Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        n2Var.setGravity(17);
        n2Var.setTextSize(1, 14.0f);
        n2Var.setTypeface(org.telegram.messenger.g0.o());
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) ".  ").append((CharSequence) org.telegram.messenger.gd.N0(2131748724, null));
        spannableStringBuilder3.setSpan(new org.telegram.ui.Components.kq(0, getContext().getDrawable(2131232251)), 0, 1, 0);
        n2Var.setText(spannableStringBuilder3);
        org.telegram.ui.ActionBar.u6.U(n2Var, org.telegram.ui.ActionBar.n6.Ji, null);
        int L = org.telegram.messenger.g0.L(24.0f);
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i11, false);
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
        n2Var.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, x02, x03, x03));
        n2Var.setOnClickListener(new ny0(this, 6));
        addView(n2Var, c8.na.d(-1, 48.0f, 80, 16.0f, 15.0f, 16.0f, 16.0f));
        a();
    }

    public final void a() {
        int i7;
        TLRPC.Document document;
        int i10;
        boolean z10;
        int i11;
        SessionsActivity sessionsActivity = this.f54506f;
        i7 = ((org.telegram.ui.ActionBar.g2) sessionsActivity).currentAccount;
        TLRPC.TL_messages_stickerSet r02 = org.telegram.messenger.ri.d0(i7).r0("tg_placeholders_android");
        if (r02 == null) {
            i11 = ((org.telegram.ui.ActionBar.g2) sessionsActivity).currentAccount;
            r02 = org.telegram.messenger.ri.d0(i11).p0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = r02;
        org.telegram.messenger.kz kzVar = null;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() > 6) {
            document = tL_messages_stickerSet.documents.get(6);
        } else {
            document = null;
        }
        if (document != null) {
            kzVar = org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.n6.f29434c7, 0.2f, false);
        }
        org.telegram.messenger.kz kzVar2 = kzVar;
        if (kzVar2 != null) {
            kzVar2.f25409e = 512;
            kzVar2.f25410f = 512;
        }
        if (document == null) {
            i10 = ((org.telegram.ui.ActionBar.g2) sessionsActivity).currentAccount;
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i10);
            if (tL_messages_stickerSet == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            d02.f1("tg_placeholders_android", false, z10);
            return;
        }
        org.telegram.messenger.fc b10 = org.telegram.messenger.fc.b(document);
        org.telegram.ui.Components.p9 p9Var = this.f54502a;
        p9Var.k(b10, "130_130", "tgs", kzVar2, tL_messages_stickerSet);
        p9Var.getImageReceiver().X(2);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25324y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i7;
        super.onAttachedToWindow();
        a();
        i7 = ((org.telegram.ui.ActionBar.g2) this.f54506f).currentAccount;
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.f25324y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i7;
        super.onDetachedFromWindow();
        i7 = ((org.telegram.ui.ActionBar.g2) this.f54506f).currentAccount;
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.f25324y0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(276.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false);
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
            org.telegram.ui.ActionBar.n2 n2Var = this.f54503b;
            if (n2Var != null) {
                if (x02 == this.d) {
                    if (x03 != this.f54505e) {
                    }
                }
                this.d = x02;
                this.f54505e = x03;
                int L = org.telegram.messenger.g0.L(24.0f);
                n2Var.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, x02, x03, x03));
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
