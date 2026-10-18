package zg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.k4;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.h9;
import w7.z5;
public final class b extends va {
    public final TextView f51667a0;
    public final FrameLayout f51668b0;
    public Drawable f51669c0;
    public Drawable f51670d0;
    public TL_stories.Boost f51671e0;
    public final a f51672f0;

    public b(Context context) {
        super(0, 0, context, false);
        int i10;
        int i11;
        this.f51672f0 = new a(getContext());
        this.f51668b0 = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.f51667a0 = textView;
        textView.setTextColor(h6.w0(h6.G6, this.f23674y));
        this.f51667a0.setTypeface(AndroidUtilities.bold());
        this.f51667a0.setTextSize(12.0f);
        this.f51667a0.setGravity(17);
        this.f51668b0.addView(this.f51667a0, z5.d(22.0f, -2));
        this.f51668b0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = this.f51668b0;
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
        addView(frameLayout, z5.a(-2.0f, i11, 9.0f, z10 ? 0 : 9, 0.0f, -2, i12));
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
        return this.f51671e0;
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
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(70.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, h6.f21114k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        int i10;
        this.f51671e0 = boost;
        boolean z10 = boost.gift;
        FrameLayout frameLayout = this.f51668b0;
        TextView textView = this.f51667a0;
        int i11 = 0;
        j5 j5Var = this.f23666b;
        if (!z10 && !boost.giveaway) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            int i12 = ((boost.expires - boost.date) / 30) / 86400;
            long j10 = boost.stars;
            int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            k4 k4Var = this.f23665a;
            h9 h9Var = this.E;
            if (i13 > 0) {
                j5Var.l(LocaleController.formatPluralString("BoostingBoostStars", (int) j10, new Object[0]), false);
                h9Var.g(26);
                k4Var.e(null, h9Var);
                j5Var.i(null);
            } else if (boost.unclaimed) {
                j5Var.l(LocaleController.getString(R.string.BoostingUnclaimed), false);
                h9Var.g(18);
                setAvatarColorByMonths(i12);
                k4Var.e(null, h9Var);
                j5Var.i(null);
            } else if (boost.user_id == -1) {
                j5Var.l(LocaleController.getString(R.string.BoostingToBeDistributed), false);
                h9Var.g(19);
                setAvatarColorByMonths(i12);
                k4Var.e(null, h9Var);
                j5Var.i(null);
            }
            String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(boost.expires * 1000));
            int i14 = (boost.stars > 0L ? 1 : (boost.stars == 0L ? 0 : -1));
            j5 j5Var2 = this.f23667c;
            if (i14 > 0) {
                j5Var2.l(LocaleController.formatString(R.string.BoostingStarsExpires, format), false);
            } else {
                j5Var2.l(LocaleController.formatString(R.string.BoostingExpires, format), false);
            }
            if (boost.gift) {
                if (this.f51670d0 == null) {
                    Drawable drawable = getResources().getDrawable(R.drawable.mini_gift);
                    this.f51670d0 = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f51670d0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setText(LocaleController.getString(R.string.BoostingGift));
                frameLayout.setBackground(h6.d0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), h6.m1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.f51669c0 == null) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.mini_giveaway);
                    this.f51669c0 = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f51669c0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setText(LocaleController.getString(R.string.BoostingGiveaway));
                frameLayout.setBackground(h6.d0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), h6.m1(0.2f, -13397548)));
            }
        }
        int i15 = boost.multiplier;
        if (i15 > 0) {
            String valueOf = String.valueOf(i15);
            a aVar = this.f51672f0;
            aVar.f51666f = valueOf;
            aVar.e = aVar.f51663a.measureText(valueOf);
            aVar.invalidateSelf();
            j5Var.i(aVar);
        } else {
            j5Var.i(null);
        }
        if (frameLayout.getVisibility() == 0) {
            int dp = AndroidUtilities.dp(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            if (LocaleController.isRTL) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int paddingTop = j5Var.getPaddingTop();
            if (!LocaleController.isRTL) {
                i11 = dp;
            }
            j5Var.setPadding(i10, paddingTop, i11, j5Var.getPaddingBottom());
            return;
        }
        j5Var.setPadding(0, j5Var.getPaddingTop(), 0, j5Var.getPaddingBottom());
    }
}
