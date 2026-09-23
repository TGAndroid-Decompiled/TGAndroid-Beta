package yg;

import ai.y5;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Cells.bb;
import org.telegram.ui.Components.h9;
import w7.x5;
public final class b extends bb {
    public final TextView f46835a0;
    public final FrameLayout f46836b0;
    public Drawable f46837c0;
    public Drawable f46838d0;
    public TL_stories.Boost f46839e0;
    public final a f46840f0;

    public b(Context context) {
        super(context, 0, 0, false);
        int i10;
        int i11;
        this.f46840f0 = new a(getContext());
        this.f46836b0 = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.f46835a0 = textView;
        textView.setTextColor(h6.v0(h6.G6, this.f19822y));
        this.f46835a0.setTypeface(AndroidUtilities.bold());
        this.f46835a0.setTextSize(12.0f);
        this.f46835a0.setGravity(17);
        this.f46836b0.addView(this.f46835a0, x5.c(22.0f, -2));
        this.f46836b0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = this.f46836b0;
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        int i12 = i10 | 48;
        if (z10) {
            i11 = 9;
        } else {
            i11 = 0;
        }
        addView(frameLayout, x5.d(-2, -2.0f, i12, i11, 9.0f, z10 ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i10) {
        h9 h9Var = this.E;
        if (i10 == 12) {
            h9Var.i(-31392, -2796986);
        } else if (i10 == 6) {
            h9Var.i(-10703110, -12481584);
        } else {
            h9Var.i(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.f46839e0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.S) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(70.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(70.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, h6.f18910k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        int i10;
        this.f46839e0 = boost;
        boolean z10 = boost.gift;
        FrameLayout frameLayout = this.f46836b0;
        TextView textView = this.f46835a0;
        int i11 = 0;
        i5 i5Var = this.f19814b;
        if (!z10 && !boost.giveaway) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            int i12 = ((boost.expires - boost.date) / 30) / 86400;
            long j3 = boost.stars;
            y5 y5Var = this.f19813a;
            h9 h9Var = this.E;
            if (j3 > 0) {
                i5Var.l(LocaleController.formatPluralString("BoostingBoostStars", (int) j3, new Object[0]), false);
                h9Var.g(26);
                y5Var.e(null, h9Var);
                i5Var.i(null);
            } else if (boost.unclaimed) {
                i5Var.l(LocaleController.getString(R.string.BoostingUnclaimed), false);
                h9Var.g(18);
                setAvatarColorByMonths(i12);
                y5Var.e(null, h9Var);
                i5Var.i(null);
            } else if (boost.user_id == -1) {
                i5Var.l(LocaleController.getString(R.string.BoostingToBeDistributed), false);
                h9Var.g(19);
                setAvatarColorByMonths(i12);
                y5Var.e(null, h9Var);
                i5Var.i(null);
            }
            String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(boost.expires * 1000));
            long j10 = boost.stars;
            i5 i5Var2 = this.f19815c;
            if (j10 > 0) {
                i5Var2.l(LocaleController.formatString(R.string.BoostingStarsExpires, format), false);
            } else {
                i5Var2.l(LocaleController.formatString(R.string.BoostingExpires, format), false);
            }
            if (boost.gift) {
                if (this.f46838d0 == null) {
                    Drawable drawable = getResources().getDrawable(R.drawable.mini_gift);
                    this.f46838d0 = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f46838d0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setText(LocaleController.getString(R.string.BoostingGift));
                frameLayout.setBackground(h6.c0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), h6.l1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.f46837c0 == null) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.mini_giveaway);
                    this.f46837c0 = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f46837c0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setText(LocaleController.getString(R.string.BoostingGiveaway));
                frameLayout.setBackground(h6.c0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), h6.l1(0.2f, -13397548)));
            }
        }
        int i13 = boost.multiplier;
        if (i13 > 0) {
            String valueOf = String.valueOf(i13);
            a aVar = this.f46840f0;
            aVar.f46834f = valueOf;
            aVar.e = aVar.f46831a.measureText(valueOf);
            aVar.invalidateSelf();
            i5Var.i(aVar);
        } else {
            i5Var.i(null);
        }
        if (frameLayout.getVisibility() == 0) {
            int dp = AndroidUtilities.dp(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            if (LocaleController.isRTL) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int paddingTop = i5Var.getPaddingTop();
            if (!LocaleController.isRTL) {
                i11 = dp;
            }
            i5Var.setPadding(i10, paddingTop, i11, i5Var.getPaddingBottom());
            return;
        }
        i5Var.setPadding(0, i5Var.getPaddingTop(), 0, i5Var.getPaddingBottom());
    }
}
