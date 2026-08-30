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
public final class vd1 extends org.telegram.ui.Components.rl0 {
    public int f39147c;
    public int d;
    public int e;
    public int f39148f;
    public int h;
    public int f39149n;
    public final yd1 f39150r;

    public vd1(yd1 yd1Var) {
        this.f39150r = yd1Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.b() >= this.f39148f && l1Var.b() < this.h) {
            return true;
        }
        return false;
    }

    public final void E() {
        this.e = -1;
        this.f39148f = -1;
        this.h = -1;
        this.f39149n = -1;
        this.f39147c = 2;
        this.d = 1;
        ArrayList arrayList = this.f39150r.f40495f;
        if (!arrayList.isEmpty()) {
            int i10 = this.f39147c;
            int i11 = i10 + 1;
            this.e = i10;
            int i12 = i10 + 2;
            this.f39147c = i12;
            this.f39148f = i11;
            int size = (arrayList.size() - 1) + i12;
            this.h = size;
            this.f39147c = size + 1;
            this.f39149n = size;
        }
    }

    @Override
    public final int h() {
        return this.f39147c;
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
        if (i10 == this.f39149n) {
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
    public final void v(f2.l1 l1Var, int i10) {
        View view = l1Var.f5785a;
        int i11 = this.e;
        yd1 yd1Var = this.f39150r;
        if (i10 >= i11 && i11 > 0) {
            view.setAlpha(yd1Var.B);
        } else {
            view.setAlpha(1.0f);
        }
        if (j(i10) == 4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            TLRPC.Chat chat = (TLRPC.Chat) yd1Var.f40495f.get(i10 - this.f39148f);
            String str = (String) yd1Var.h.get(i10 - this.f39148f);
            String str2 = chat.title;
            boolean z4 = true;
            if (i10 == this.h - 1) {
                z4 = false;
            }
            g4Var.e(chat, str2, str, z4);
            g4Var.c(yd1Var.f40499w.contains(Long.valueOf(chat.f19184id)), false);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        String string;
        org.telegram.ui.Cells.m4 m4Var;
        org.telegram.ui.Cells.g4 g4Var;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        g4Var = new org.telegram.ui.Cells.g4(viewGroup.getContext(), 1, 0, false);
                    } else {
                        g4Var = new org.telegram.ui.Cells.k3(viewGroup.getContext(), AndroidUtilities.dp(12.0f));
                    }
                } else {
                    org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(viewGroup.getContext(), org.telegram.ui.ActionBar.j6.L6, 21, 8, false, null);
                    m4Var2.setHeight(54);
                    m4Var2.setText(LocaleController.getString(R.string.InactiveChats));
                    m4Var = m4Var2;
                }
            } else {
                View z6Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (b) null);
                org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false)), org.telegram.ui.ActionBar.j6.V0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f19871b7));
                nqVar.f27342w = true;
                z6Var.setBackground(nqVar);
                g4Var = z6Var;
            }
            m4Var = g4Var;
        } else {
            Context context = viewGroup.getContext();
            ?? frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.j6.m9;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            TextView textView = new TextView(context);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            frameLayout.addView(textView, k7.b6.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f21407a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19963g9, false));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            frameLayout.addView(textView2, k7.b6.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            dg.v3 v3Var = new dg.v3(context, new Paint(1), textPaint);
            v3Var.setWillNotDraw(false);
            v3Var.addView(imageView, k7.b6.e(-2, -2, 1));
            frameLayout.addView(v3Var, k7.b6.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(LocaleController.getString(R.string.TooManyCommunities));
            imageView.setImageResource(R.drawable.groups_limit1);
            yd1 yd1Var = this.f39150r;
            yd1Var.f40500x = frameLayout;
            int i12 = yd1Var.D;
            if (i12 == 0) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintJoin);
            } else if (i12 == 1) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintEdit);
            } else {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintCreate);
            }
            yd1Var.f40500x.setMessageText(string);
            f2.w0 w0Var = new f2.w0(-1, -2);
            ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) w0Var).topMargin = AndroidUtilities.dp(23.0f);
            yd1Var.f40500x.setLayoutParams(w0Var);
            m4Var = frameLayout;
        }
        return new f2.l1(m4Var);
    }
}
