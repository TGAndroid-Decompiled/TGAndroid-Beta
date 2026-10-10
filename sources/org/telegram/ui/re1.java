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
public final class re1 extends org.telegram.ui.Components.qm0 {
    public int f41445c;
    public int d;
    public int f41446e;
    public int f41447f;
    public int h;
    public int f41448n;
    public final ue1 f41449r;

    public re1(ue1 ue1Var) {
        this.f41449r = ue1Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.b() >= this.f41447f && d1Var.b() < this.h) {
            return true;
        }
        return false;
    }

    public final void E() {
        this.f41446e = -1;
        this.f41447f = -1;
        this.h = -1;
        this.f41448n = -1;
        this.f41445c = 2;
        this.d = 1;
        ArrayList arrayList = this.f41449r.f42460f;
        if (!arrayList.isEmpty()) {
            int i10 = this.f41445c;
            int i11 = i10 + 1;
            this.f41446e = i10;
            int i12 = i10 + 2;
            this.f41445c = i12;
            this.f41447f = i11;
            int size = (arrayList.size() - 1) + i12;
            this.h = size;
            this.f41445c = size + 1;
            this.f41448n = size;
        }
    }

    @Override
    public final int h() {
        return this.f41445c;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == this.d) {
            return 2;
        }
        if (i10 == this.f41446e) {
            return 3;
        }
        if (i10 == this.f41448n) {
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
    public final void v(s4.d1 d1Var, int i10) {
        View view = d1Var.f47702a;
        int i11 = this.f41446e;
        ue1 ue1Var = this.f41449r;
        if (i10 >= i11 && i11 > 0) {
            view.setAlpha(ue1Var.E);
        } else {
            view.setAlpha(1.0f);
        }
        if (j(i10) == 4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            TLRPC.Chat chat = (TLRPC.Chat) ue1Var.f42460f.get(i10 - this.f41447f);
            String str = (String) ue1Var.h.get(i10 - this.f41447f);
            String str2 = chat.title;
            boolean z10 = true;
            if (i10 == this.h - 1) {
                z10 = false;
            }
            g4Var.e(chat, str2, str, z10);
            g4Var.c(ue1Var.f42464w.contains(Long.valueOf(chat.f20042id)), false);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
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
                    org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(viewGroup.getContext(), org.telegram.ui.ActionBar.i6.L6, 21, 8, false, null);
                    m4Var2.setHeight(54);
                    m4Var2.setText(LocaleController.getString(R.string.InactiveChats));
                    m4Var = m4Var2;
                }
            } else {
                View b7Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), (org.telegram.ui.Cells.c1) null);
                org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(new ColorDrawable(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20745a7, false)), org.telegram.ui.ActionBar.i6.W0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.i6.f20765b7));
                frVar.f26503w = true;
                b7Var.setBackground(frVar);
                g4Var = b7Var;
            }
            m4Var = g4Var;
        } else {
            Context context = viewGroup.getContext();
            ?? frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.i6.f20969m9;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            TextView textView = new TextView(context);
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            frameLayout.addView(textView, w7.x5.a(-2.0f, 52.0f, 75.0f, 52.0f, 0.0f, -1, 51));
            TextView textView2 = new TextView(context);
            frameLayout.f22624a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20860g9, false));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            frameLayout.addView(textView2, w7.x5.a(-2.0f, 36.0f, 110.0f, 36.0f, 0.0f, -1, 51));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            ai.x7 x7Var = new ai.x7(context, new Paint(1), textPaint);
            x7Var.setWillNotDraw(false);
            x7Var.addView(imageView, w7.x5.e(-2, -2, 1));
            frameLayout.addView(x7Var, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 6.0f, -2, 49));
            textView.setText(LocaleController.getString(R.string.TooManyCommunities));
            imageView.setImageResource(R.drawable.groups_limit1);
            ue1 ue1Var = this.f41449r;
            ue1Var.f42465x = frameLayout;
            int i12 = ue1Var.G;
            if (i12 == 0) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintJoin);
            } else if (i12 == 1) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintEdit);
            } else {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintCreate);
            }
            ue1Var.f42465x.setMessageText(string);
            s4.q0 q0Var = new s4.q0(-1, -2);
            ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) q0Var).topMargin = AndroidUtilities.dp(23.0f);
            ue1Var.f42465x.setLayoutParams(q0Var);
            m4Var = frameLayout;
        }
        return new s4.d1(m4Var);
    }
}
