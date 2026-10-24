package zg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.j4;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.Cells.wa;
import org.telegram.ui.Components.f9;
import w7.z5;
public final class b extends wa {
    public final TextView f52092b0;
    public final FrameLayout f52093c0;
    public Drawable f52094d0;
    public Drawable f52095e0;
    public TL_stories.Boost f52096f0;
    public final a f52097g0;

    public b(Context context) {
        super(context, 0, 0, false);
        int i10;
        int i11;
        this.f52097g0 = new a(getContext());
        this.f52093c0 = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.f52092b0 = textView;
        textView.setTextColor(k6.w0(k6.G6, this.f23935y));
        this.f52092b0.setTypeface(AndroidUtilities.bold());
        this.f52092b0.setTextSize(12.0f);
        this.f52092b0.setGravity(17);
        this.f52093c0.addView(this.f52092b0, z5.c(22.0f, -2));
        this.f52093c0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = this.f52093c0;
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
        addView(frameLayout, z5.d(-2, -2.0f, i12, i11, 9.0f, z10 ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i10) {
        f9 f9Var = this.E;
        if (i10 == 12) {
            f9Var.i(-31392, -2796986);
        } else if (i10 == 6) {
            f9Var.i(-10703110, -12481584);
        } else {
            f9Var.i(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.f52096f0;
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
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, k6.f21305k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        int i10;
        this.f52096f0 = boost;
        boolean z10 = boost.gift;
        FrameLayout frameLayout = this.f52093c0;
        TextView textView = this.f52092b0;
        int i11 = 0;
        n5 n5Var = this.f23927b;
        if (!z10 && !boost.giveaway) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            int i12 = ((boost.expires - boost.date) / 30) / 86400;
            long j10 = boost.stars;
            int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            j4 j4Var = this.f23925a;
            f9 f9Var = this.E;
            if (i13 > 0) {
                n5Var.l(LocaleController.formatPluralString("BoostingBoostStars", (int) j10, new Object[0]), false);
                f9Var.g(26);
                j4Var.e(null, f9Var);
                n5Var.i(null);
            } else if (boost.unclaimed) {
                n5Var.l(LocaleController.getString(R.string.BoostingUnclaimed), false);
                f9Var.g(18);
                setAvatarColorByMonths(i12);
                j4Var.e(null, f9Var);
                n5Var.i(null);
            } else if (boost.user_id == -1) {
                n5Var.l(LocaleController.getString(R.string.BoostingToBeDistributed), false);
                f9Var.g(19);
                setAvatarColorByMonths(i12);
                j4Var.e(null, f9Var);
                n5Var.i(null);
            }
            String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(boost.expires * 1000));
            int i14 = (boost.stars > 0L ? 1 : (boost.stars == 0L ? 0 : -1));
            n5 n5Var2 = this.f23928c;
            if (i14 > 0) {
                n5Var2.l(LocaleController.formatString(R.string.BoostingStarsExpires, format), false);
            } else {
                n5Var2.l(LocaleController.formatString(R.string.BoostingExpires, format), false);
            }
            if (boost.gift) {
                if (this.f52095e0 == null) {
                    Drawable drawable = getResources().getDrawable(R.drawable.mini_gift);
                    this.f52095e0 = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f52095e0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setText(LocaleController.getString(R.string.BoostingGift));
                frameLayout.setBackground(k6.d0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), k6.o1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.f52094d0 == null) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.mini_giveaway);
                    this.f52094d0 = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f52094d0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setText(LocaleController.getString(R.string.BoostingGiveaway));
                frameLayout.setBackground(k6.d0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), k6.o1(0.2f, -13397548)));
            }
        }
        int i15 = boost.multiplier;
        if (i15 > 0) {
            String valueOf = String.valueOf(i15);
            a aVar = this.f52097g0;
            aVar.f52091f = valueOf;
            aVar.e = aVar.f52088a.measureText(valueOf);
            aVar.invalidateSelf();
            n5Var.i(aVar);
        } else {
            n5Var.i(null);
        }
        if (frameLayout.getVisibility() == 0) {
            int dp = AndroidUtilities.dp(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            if (LocaleController.isRTL) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int paddingTop = n5Var.getPaddingTop();
            if (!LocaleController.isRTL) {
                i11 = dp;
            }
            n5Var.setPadding(i10, paddingTop, i11, n5Var.getPaddingBottom());
            return;
        }
        n5Var.setPadding(0, n5Var.getPaddingTop(), 0, n5Var.getPaddingBottom());
    }
}
