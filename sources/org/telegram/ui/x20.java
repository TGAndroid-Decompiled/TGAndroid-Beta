package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class x20 extends org.telegram.ui.Components.x10 {
    public final c30 f51696p1;

    public x20(c30 c30Var, Context context, TLRPC.Chat chat, boolean z10) {
        super(context, false);
        int i3;
        int i10;
        int i11;
        this.f51696p1 = c30Var;
        int i12 = org.telegram.ui.ActionBar.k6.Tg;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        org.telegram.ui.ActionBar.r6.y(this.f28586b, this.f28616s0, i12, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Components.s10 s10Var = new org.telegram.ui.Components.s10(this, context);
        this.f28586b = s10Var;
        s10Var.setWillNotDraw(false);
        this.f28586b.setClipChildren(false);
        this.f28586b.setBackgroundDrawable(this.f28616s0);
        ViewGroup viewGroup = this.f28586b;
        int i13 = this.f28618u0;
        viewGroup.setPadding(i13, 0, i13, 0);
        TextView textView = new TextView(getContext());
        if (org.telegram.messenger.t3.W(chat)) {
            textView.setText(org.telegram.messenger.bd.M0(2131743476, null));
        } else {
            textView.setText(org.telegram.messenger.bd.M0(2131743258, null));
        }
        textView.setTextColor(-1);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 48);
        ViewGroup viewGroup2 = this.f28586b;
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        viewGroup2.addView(textView, b8.mf.d(-2, -2.0f, i10 | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(org.telegram.messenger.bd.M0(2131743257, null));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        if (org.telegram.messenger.bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11 | 48);
        this.f28586b.addView(textView2, b8.mf.d(-2, -2.0f, (org.telegram.messenger.bd.f21784a0 ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.m1 = new TextView[3];
        b5.l lVar = new b5.l(context);
        this.f40192j1 = lVar;
        lVar.setClipChildren(false);
        lVar.setOffscreenPageLimit(4);
        lVar.setClipToPadding(false);
        org.telegram.messenger.g0.C3(lVar, 2130706432);
        lVar.setAdapter(new org.telegram.ui.Components.w10(this, 0));
        lVar.setPageMargin(0);
        this.f28586b.addView(lVar, b8.mf.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        lVar.b(new org.telegram.ui.Components.t10(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{x02, 0}));
        this.f28586b.addView(view, b8.mf.d(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, x02}));
        this.f28586b.addView(view2, b8.mf.d(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        org.telegram.ui.Components.u10 u10Var = new org.telegram.ui.Components.u10(this, getContext());
        this.k1 = u10Var;
        u10Var.setMinWidth(org.telegram.messenger.g0.L(64.0f));
        u10Var.setTag(-1);
        u10Var.setTextSize(1, 14.0f);
        int i14 = org.telegram.ui.ActionBar.k6.f27853bh;
        org.telegram.ui.ActionBar.r6.V(u10Var, i14, null);
        u10Var.setGravity(17);
        u10Var.setTypeface(org.telegram.messenger.g0.o());
        u10Var.setText(org.telegram.messenger.bd.M0(2131743259, null));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 76);
        u10Var.setForeground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, o10, o10));
        u10Var.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        u10Var.setOnClickListener(new org.telegram.ui.Components.f0(this, 22));
        this.f28586b.addView(u10Var, b8.mf.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f40193l1 = linearLayout;
        this.f28586b.addView(linearLayout, b8.mf.e(-2, 64, 80));
        int i15 = 0;
        while (true) {
            TextView[] textViewArr = this.m1;
            if (i15 >= textViewArr.length) {
                break;
            }
            textViewArr[i15] = new TextView(context);
            this.m1[i15].setTextSize(1, 12.0f);
            this.m1[i15].setTextColor(-1);
            this.m1[i15].setTypeface(org.telegram.messenger.g0.o());
            this.m1[i15].setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            this.m1[i15].setGravity(16);
            this.m1[i15].setSingleLine(true);
            this.f40193l1.addView(this.m1[i15], b8.mf.o(-2, -1));
            if (i15 == 0) {
                this.m1[i15].setText(org.telegram.messenger.bd.M0(2131743262, null));
            } else if (i15 == 1) {
                this.m1[i15].setText(org.telegram.messenger.bd.M0(2131743260, null));
            } else {
                this.m1[i15].setText(org.telegram.messenger.bd.M0(2131743261, null));
            }
            this.m1[i15].setOnClickListener(new bi.q(this, i15, 12));
            i15++;
        }
        if (z10) {
            this.f40192j1.setCurrentItem(1);
        }
    }

    public final void J0(int i3) {
        int i10;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        int i11 = org.telegram.ui.ActionBar.k6.f27889dh;
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.J = i11;
        x30 x30Var = this.f51696p1.f44213b;
        x30Var.f51773o2 = false;
        s1Var.S = org.telegram.messenger.bd.M0(2131743336, null);
        if (i3 == 0) {
            if (x30Var.S2.f25049b.rtmp_stream) {
                i10 = 2131743339;
            } else {
                i10 = 2131743337;
            }
            s1Var.U = org.telegram.messenger.bd.M0(i10, null);
        } else {
            int i12 = 2131743338;
            if (org.telegram.messenger.t3.W(x30Var.R2)) {
                if (!x30Var.S2.f25049b.rtmp_stream) {
                    i12 = 2131743467;
                }
                s1Var.U = org.telegram.messenger.bd.M0(i12, null);
            } else {
                if (!x30Var.S2.f25049b.rtmp_stream) {
                    i12 = 2131743335;
                }
                s1Var.U = org.telegram.messenger.bd.M0(i12, null);
            }
        }
        s1Var.B0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V(getContext(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27854bi, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27871ci, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i13 = org.telegram.ui.ActionBar.k6.f27853bh;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i13, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(org.telegram.messenger.bd.M0(2131743353, null));
        editTextBoldCursor.setImeOptions(6);
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f27870ch, null);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, i13, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, b8.mf.t(-1, 36, 51, 24, 0, 24, 12));
        editTextBoldCursor.setOnEditorActionListener(new wx(alertDialog$Builder, 2));
        s1Var.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Tg, false));
        s1Var.setOnShowListener(new w20(this, s1Var, editTextBoldCursor, 1));
        s1Var.setOnDismissListener(new xx(editTextBoldCursor, 2));
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131744925, null), new k2.y(this, editTextBoldCursor, i3, 11));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new vx(editTextBoldCursor, 2));
        s1Var.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27980ih, false));
        s1Var.show();
        s1Var.p(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
        editTextBoldCursor.requestFocus();
    }
}
