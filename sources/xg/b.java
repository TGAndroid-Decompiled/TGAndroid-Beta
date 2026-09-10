package xg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import gg.i1;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.bb;
import org.telegram.ui.Components.g9;
import w7.a6;
public final class b extends bb {
    public final TextView f45199a0;
    public final FrameLayout f45200b0;
    public Drawable f45201c0;
    public Drawable f45202d0;
    public TL_stories.Boost f45203e0;
    public final a f45204f0;

    public b(Context context) {
        super(context, 0, 0, false);
        int i10;
        int i11;
        this.f45204f0 = new a(getContext());
        this.f45200b0 = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.f45199a0 = textView;
        textView.setTextColor(j6.v0(j6.G6, this.f18949y));
        this.f45199a0.setTypeface(AndroidUtilities.bold());
        this.f45199a0.setTextSize(12.0f);
        this.f45199a0.setGravity(17);
        this.f45200b0.addView(this.f45199a0, a6.c(22.0f, -2));
        this.f45200b0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = this.f45200b0;
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
        addView(frameLayout, a6.d(-2, -2.0f, i12, i11, 9.0f, z10 ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i10) {
        g9 g9Var = this.E;
        if (i10 == 12) {
            g9Var.i(-31392, -2796986);
        } else if (i10 == 6) {
            g9Var.i(-10703110, -12481584);
        } else {
            g9Var.i(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.f45203e0;
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, j6.f18049k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        int i10;
        this.f45203e0 = boost;
        boolean z10 = boost.gift;
        FrameLayout frameLayout = this.f45200b0;
        TextView textView = this.f45199a0;
        int i11 = 0;
        l5 l5Var = this.f18941b;
        if (!z10 && !boost.giveaway) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            int i12 = ((boost.expires - boost.date) / 30) / 86400;
            long j3 = boost.stars;
            i1 i1Var = this.f18940a;
            g9 g9Var = this.E;
            if (j3 > 0) {
                l5Var.l(LocaleController.formatPluralString("BoostingBoostStars", (int) j3, new Object[0]), false);
                g9Var.g(26);
                i1Var.e(null, g9Var);
                l5Var.i(null);
            } else if (boost.unclaimed) {
                l5Var.l(LocaleController.getString(R.string.BoostingUnclaimed), false);
                g9Var.g(18);
                setAvatarColorByMonths(i12);
                i1Var.e(null, g9Var);
                l5Var.i(null);
            } else if (boost.user_id == -1) {
                l5Var.l(LocaleController.getString(R.string.BoostingToBeDistributed), false);
                g9Var.g(19);
                setAvatarColorByMonths(i12);
                i1Var.e(null, g9Var);
                l5Var.i(null);
            }
            String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(boost.expires * 1000));
            long j10 = boost.stars;
            l5 l5Var2 = this.f18942c;
            if (j10 > 0) {
                l5Var2.l(LocaleController.formatString(R.string.BoostingStarsExpires, format), false);
            } else {
                l5Var2.l(LocaleController.formatString(R.string.BoostingExpires, format), false);
            }
            if (boost.gift) {
                if (this.f45202d0 == null) {
                    Drawable drawable = getResources().getDrawable(R.drawable.mini_gift);
                    this.f45202d0 = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f45202d0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setText(LocaleController.getString(R.string.BoostingGift));
                frameLayout.setBackground(j6.c0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), j6.l1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.f45201c0 == null) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.mini_giveaway);
                    this.f45201c0 = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f45201c0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setText(LocaleController.getString(R.string.BoostingGiveaway));
                frameLayout.setBackground(j6.c0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), j6.l1(0.2f, -13397548)));
            }
        }
        int i13 = boost.multiplier;
        if (i13 > 0) {
            String valueOf = String.valueOf(i13);
            a aVar = this.f45204f0;
            aVar.f45198f = valueOf;
            aVar.e = aVar.f45195a.measureText(valueOf);
            aVar.invalidateSelf();
            l5Var.i(aVar);
        } else {
            l5Var.i(null);
        }
        if (frameLayout.getVisibility() == 0) {
            int dp = AndroidUtilities.dp(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            if (LocaleController.isRTL) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int paddingTop = l5Var.getPaddingTop();
            if (!LocaleController.isRTL) {
                i11 = dp;
            }
            l5Var.setPadding(i10, paddingTop, i11, l5Var.getPaddingBottom());
            return;
        }
        l5Var.setPadding(0, l5Var.getPaddingTop(), 0, l5Var.getPaddingBottom());
    }
}
