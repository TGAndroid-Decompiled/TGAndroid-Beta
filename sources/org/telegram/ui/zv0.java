package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
public class zv0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.k5 f40867a;
    public final TextView f40868b;
    public final ImageView f40869c;
    public final ImageView d;
    public boolean e;
    public pw0 f40870f;
    public org.telegram.ui.Components.j5 h;
    public Drawable f40871n;

    public zv0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f40867a = k5Var;
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setTextSize(15);
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        linearLayout.addView(k5Var, k7.b6.n(-1, -2));
        TextView textView = new TextView(context);
        this.f40868b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20281y6, f6Var));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, k7.b6.p(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, k7.b6.d(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.f40869c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, k7.b6.d(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.M6, f6Var));
        addView(imageView2, k7.b6.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(pw0 pw0Var, boolean z4) {
        long longValue;
        boolean isPremium = UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        ImageView imageView = this.d;
        if (isPremium && pw0Var.f37545a == 12 && pw0Var.f37546b == R.drawable.filled_premium_status2) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), 13, this, false);
                if (isAttachedToWindow()) {
                    this.h.a();
                }
            }
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
            if (emojiStatusDocumentId == null) {
                longValue = 0;
            } else {
                longValue = emojiStatusDocumentId.longValue();
            }
            b(longValue, false);
        } else {
            imageView.setVisibility(0);
            org.telegram.ui.Components.j5 j5Var = this.h;
            if (j5Var != null) {
                j5Var.b();
                this.h = null;
            }
        }
        this.f40870f = pw0Var;
        this.f40867a.l(pw0Var.f37547c, false);
        this.f40868b.setText(pw0Var.d);
        this.f40869c.setImageResource(pw0Var.f37546b);
        this.e = z4;
    }

    public final void b(long j10, boolean z4) {
        if (this.h == null) {
            this.h = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j10 == 0) {
            if (this.f40871n == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_prolfilestar).mutate();
                this.f40871n = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20225v6, false), PorterDuff.Mode.SRC_IN));
            }
            this.h.g(this.f40871n, z4);
            return;
        }
        this.h.j(j10, z4);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.f25878s) - AndroidUtilities.dp(21.0f), (getHeight() - this.h.f25878s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + this.h.f25878s) / 2);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20225v6, false)));
            this.h.draw(canvas);
        }
        if (this.e) {
            canvas.drawRect(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f20025k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.Components.j5 j5Var = this.h;
        if (j5Var != null) {
            j5Var.a();
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.ui.Components.j5 j5Var = this.h;
        if (j5Var != null) {
            j5Var.b();
        }
        super.onDetachedFromWindow();
    }
}
