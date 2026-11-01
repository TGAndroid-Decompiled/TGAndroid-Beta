package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class z91 extends org.telegram.ui.Components.tk0 {
    public int f43856c;
    public int d;
    public int e;
    public int f43857f;
    public int h;
    public int f43858n;
    public final ca1 f43859r;

    public z91(ca1 ca1Var) {
        this.f43859r = ca1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.b() >= this.f43857f && c1Var.b() < this.h) {
            return true;
        }
        return false;
    }

    public final void E() {
        this.e = -1;
        this.f43857f = -1;
        this.h = -1;
        this.f43858n = -1;
        this.f43856c = 2;
        this.d = 1;
        ArrayList arrayList = this.f43859r.f36273f;
        if (!arrayList.isEmpty()) {
            int i10 = this.f43856c;
            int i11 = i10 + 1;
            this.e = i10;
            int i12 = i10 + 2;
            this.f43856c = i12;
            this.f43857f = i11;
            int size = (arrayList.size() - 1) + i12;
            this.h = size;
            this.f43856c = size + 1;
            this.f43858n = size;
        }
    }

    @Override
    public final int b() {
        return this.f43856c;
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == this.d) {
            return 2;
        }
        if (i10 == this.e) {
            return 3;
        }
        if (i10 == this.f43858n) {
            return 5;
        }
        return 4;
    }

    @Override
    public final void f() {
        E();
        super.f();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        View view = c1Var.f47909a;
        int i11 = this.e;
        ca1 ca1Var = this.f43859r;
        if (i10 >= i11 && i11 > 0) {
            view.setAlpha(ca1Var.E);
        } else {
            view.setAlpha(1.0f);
        }
        if (d(i10) == 4) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            TLRPC.Chat chat = (TLRPC.Chat) ca1Var.f36273f.get(i10 - this.f43857f);
            String str = (String) ca1Var.h.get(i10 - this.f43857f);
            String str2 = chat.title;
            boolean z10 = true;
            if (i10 == this.h - 1) {
                z10 = false;
            }
            j4Var.e(chat, str2, str, z10);
            j4Var.c(ca1Var.f36278x.contains(Long.valueOf(chat.f19794id)), false);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        String L0;
        org.telegram.ui.Cells.p4 p4Var;
        org.telegram.ui.Cells.j4 j4Var;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        j4Var = new org.telegram.ui.Cells.j4(viewGroup.getContext(), 1, 0, false);
                    } else {
                        j4Var = new org.telegram.ui.Cells.o3(viewGroup.getContext(), org.telegram.messenger.i0.L(12.0f));
                    }
                } else {
                    org.telegram.ui.Cells.p4 p4Var2 = new org.telegram.ui.Cells.p4(viewGroup.getContext(), org.telegram.ui.ActionBar.t6.L6, 21, 8, false, null);
                    p4Var2.setHeight(54);
                    p4Var2.setText(org.telegram.messenger.dd.L0(2131749219, null));
                    p4Var = p4Var2;
                }
            } else {
                View c7Var = new org.telegram.ui.Cells.c7(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
                Drawable Y0 = org.telegram.ui.ActionBar.t6.Y0(viewGroup.getContext(), 2131231230, org.telegram.ui.ActionBar.t6.f20893b7);
                int i11 = org.telegram.ui.ActionBar.t6.f20873a7;
                ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
                org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(colorDrawable, Y0);
                eqVar.f25909x = true;
                c7Var.setBackground(eqVar);
                org.telegram.ui.ActionBar.a7.y(c7Var, colorDrawable, i11, null, PorterDuff.Mode.SRC_IN);
                j4Var = c7Var;
            }
            p4Var = j4Var;
        } else {
            Context context = viewGroup.getContext();
            ?? frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            int i12 = org.telegram.ui.ActionBar.t6.f21099m9;
            org.telegram.ui.ActionBar.a7.t(imageView, i12, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(context);
            org.telegram.messenger.m5.m(textView, i12, null, 1, 20.0f);
            textView.setGravity(17);
            frameLayout.addView(textView, w7.b6.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f22008a = textView2;
            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f20989g9, null);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            frameLayout.addView(textView2, w7.b6.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
            textPaint.setTypeface(org.telegram.messenger.i0.o());
            jg.a3 a3Var = new jg.a3(context, new Paint(1), textPaint);
            a3Var.setWillNotDraw(false);
            a3Var.addView(imageView, w7.b6.e(-2, -2, 1));
            frameLayout.addView(a3Var, w7.b6.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(org.telegram.messenger.dd.L0(2131744065, null));
            imageView.setImageResource(2131231235);
            ca1 ca1Var = this.f43859r;
            ca1Var.f36279y = frameLayout;
            int i13 = ca1Var.G;
            if (i13 == 0) {
                L0 = org.telegram.messenger.dd.L0(2131744062, null);
            } else if (i13 == 1) {
                L0 = org.telegram.messenger.dd.L0(2131744063, null);
            } else {
                L0 = org.telegram.messenger.dd.L0(2131744064, null);
            }
            ca1Var.f36279y.setMessageText(L0);
            s4.o0 o0Var = new s4.o0(-1, -2);
            ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin = org.telegram.messenger.i0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) o0Var).topMargin = org.telegram.messenger.i0.L(23.0f);
            ca1Var.f36279y.setLayoutParams(o0Var);
            p4Var = frameLayout;
        }
        return new s4.c1(p4Var);
    }
}
