package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class we1 extends org.telegram.ui.Components.lm0 {
    public int f40945c;
    public int d;
    public int e;
    public int f40946f;
    public int h;
    public int f40947n;
    public final ze1 f40948r;

    public we1(ze1 ze1Var) {
        this.f40948r = ze1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.b() >= this.f40946f && b1Var.b() < this.h) {
            return true;
        }
        return false;
    }

    public final void E() {
        this.e = -1;
        this.f40946f = -1;
        this.h = -1;
        this.f40947n = -1;
        this.f40945c = 2;
        this.d = 1;
        ArrayList arrayList = this.f40948r.f42295f;
        if (!arrayList.isEmpty()) {
            int i10 = this.f40945c;
            int i11 = i10 + 1;
            this.e = i10;
            int i12 = i10 + 2;
            this.f40945c = i12;
            this.f40946f = i11;
            int size = (arrayList.size() - 1) + i12;
            this.h = size;
            this.f40945c = size + 1;
            this.f40947n = size;
        }
    }

    @Override
    public final int h() {
        return this.f40945c;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == this.d) {
            return 2;
        }
        if (i10 == this.e) {
            return 3;
        }
        if (i10 == this.f40947n) {
            return 5;
        }
        return 4;
    }

    @Override
    public final void l() {
        E();
        super.l();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.f44838a;
        int i11 = this.e;
        ze1 ze1Var = this.f40948r;
        if (i10 >= i11 && i11 > 0) {
            view.setAlpha(ze1Var.E);
        } else {
            view.setAlpha(1.0f);
        }
        if (j(i10) == 4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            TLRPC.Chat chat = (TLRPC.Chat) ze1Var.f42295f.get(i10 - this.f40946f);
            String str = (String) ze1Var.h.get(i10 - this.f40946f);
            String str2 = chat.title;
            boolean z10 = true;
            if (i10 == this.h - 1) {
                z10 = false;
            }
            g4Var.e(chat, str2, str, z10);
            g4Var.c(ze1Var.f42299w.contains(Long.valueOf(chat.f18916id)), false);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        String string;
        org.telegram.ui.Cells.m4 m4Var;
        org.telegram.ui.Cells.g4 g4Var;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        g4Var = new org.telegram.ui.Cells.g4(1, 0, viewGroup.getContext(), false);
                    } else {
                        g4Var = new org.telegram.ui.Cells.l3(viewGroup.getContext(), AndroidUtilities.dp(12.0f));
                    }
                } else {
                    org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(viewGroup.getContext(), org.telegram.ui.ActionBar.g6.L6, 21, 8, false, null);
                    m4Var2.setHeight(54);
                    m4Var2.setText(LocaleController.getString(R.string.InactiveChats));
                    m4Var = m4Var2;
                }
            } else {
                View a7Var = new org.telegram.ui.Cells.a7(viewGroup.getContext(), (org.telegram.ui.Cells.c1) null);
                org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(new ColorDrawable(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false)), org.telegram.ui.ActionBar.g6.W0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f19563b7));
                crVar.f23883w = true;
                a7Var.setBackground(crVar);
                g4Var = a7Var;
            }
            m4Var = g4Var;
        } else {
            Context context = viewGroup.getContext();
            ?? frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.g6.f19767m9;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            TextView textView = new TextView(context);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            frameLayout.addView(textView, w7.z5.a(-2.0f, 52.0f, 75.0f, 52.0f, 0.0f, -1, 51));
            TextView textView2 = new TextView(context);
            frameLayout.f21365a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19657g9, false));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            frameLayout.addView(textView2, w7.z5.a(-2.0f, 36.0f, 110.0f, 36.0f, 0.0f, -1, 51));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            bi.i7 i7Var = new bi.i7(context, new Paint(1), textPaint);
            i7Var.setWillNotDraw(false);
            i7Var.addView(imageView, w7.z5.e(-2, -2, 1));
            frameLayout.addView(i7Var, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 6.0f, -2, 49));
            textView.setText(LocaleController.getString(R.string.TooManyCommunities));
            imageView.setImageResource(R.drawable.groups_limit1);
            ze1 ze1Var = this.f40948r;
            ze1Var.f42300x = frameLayout;
            int i12 = ze1Var.G;
            if (i12 == 0) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintJoin);
            } else if (i12 == 1) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintEdit);
            } else {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintCreate);
            }
            ze1Var.f42300x.setMessageText(string);
            s4.o0 o0Var = new s4.o0(-1, -2);
            ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) o0Var).topMargin = AndroidUtilities.dp(23.0f);
            ze1Var.f42300x.setLayoutParams(o0Var);
            m4Var = frameLayout;
        }
        return new s4.b1(m4Var);
    }
}
