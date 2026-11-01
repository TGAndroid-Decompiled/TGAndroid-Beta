package rg;

import ag.d2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.r8;
import w7.b6;
public final class b extends pa {
    public final TextView f46599b0;
    public final FrameLayout f46600c0;
    public Drawable f46601d0;
    public Drawable f46602e0;
    public TL_stories.Boost f46603f0;
    public final a f46604g0;

    public b(Context context) {
        super(context, 0, 0, false);
        int i10;
        int i11;
        this.f46604g0 = new a(getContext());
        this.f46600c0 = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.f46599b0 = textView;
        textView.setTextColor(t6.w0(t6.G6, this.D));
        this.f46599b0.setTypeface(i0.o());
        this.f46599b0.setTextSize(12.0f);
        this.f46599b0.setGravity(17);
        this.f46600c0.addView(this.f46599b0, b6.c(22.0f, -2));
        this.f46600c0.setPadding(i0.L(8.0f), 0, i0.L(8.0f), 0);
        FrameLayout frameLayout = this.f46600c0;
        boolean z10 = dd.X;
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
        addView(frameLayout, b6.d(-2, -2.0f, i12, i11, 9.0f, z10 ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i10) {
        r8 r8Var = this.E;
        if (i10 == 12) {
            r8Var.i(-31392, -2796986);
        } else if (i10 == 6) {
            r8Var.i(-10703110, -12481584);
        } else {
            r8Var.i(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.f46603f0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        if (this.S) {
            if (dd.X) {
                L = 0.0f;
            } else {
                L = i0.L(70.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (dd.X) {
                i10 = i0.L(70.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, t6.f21053k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        int i10;
        this.f46603f0 = boost;
        boolean z10 = boost.gift;
        FrameLayout frameLayout = this.f46600c0;
        TextView textView = this.f46599b0;
        int i11 = 0;
        u5 u5Var = this.f22471b;
        if (!z10 && !boost.giveaway) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            int i12 = ((boost.expires - boost.date) / 30) / 86400;
            long j10 = boost.stars;
            int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            d2 d2Var = this.f22469a;
            r8 r8Var = this.E;
            if (i13 > 0) {
                u5Var.l(dd.G((int) j10, "BoostingBoostStars", new Object[0]), false);
                r8Var.g(26);
                d2Var.e(null, r8Var);
                u5Var.i(null);
            } else if (boost.unclaimed) {
                u5Var.l(dd.L0(2131753177, null), false);
                r8Var.g(18);
                setAvatarColorByMonths(i12);
                d2Var.e(null, r8Var);
                u5Var.i(null);
            } else if (boost.user_id == -1) {
                u5Var.l(dd.L0(2131753178, null), false);
                r8Var.g(19);
                setAvatarColorByMonths(i12);
                d2Var.e(null, r8Var);
                u5Var.i(null);
            }
            String format = dd.D0().n0().format(new Date(boost.expires * 1000));
            int i14 = (boost.stars > 0L ? 1 : (boost.stars == 0L ? 0 : -1));
            u5 u5Var2 = this.f22472c;
            if (i14 > 0) {
                u5Var2.l(dd.a0(null, null, 2131753244, format), false);
            } else {
                u5Var2.l(dd.a0(null, null, 2131753524, format), false);
            }
            if (boost.gift) {
                if (this.f46602e0 == null) {
                    Drawable drawable = getResources().getDrawable(2131231946);
                    this.f46602e0 = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f46602e0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(i0.L(4.0f));
                textView.setText(dd.L0(2131753501, null));
                frameLayout.setBackground(t6.e0(i0.L(12.0f), i0.L(12.0f), t6.r1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.f46601d0 == null) {
                    Drawable drawable2 = getResources().getDrawable(2131231952);
                    this.f46601d0 = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f46601d0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(i0.L(4.0f));
                textView.setText(dd.L0(2131753492, null));
                frameLayout.setBackground(t6.e0(i0.L(12.0f), i0.L(12.0f), t6.r1(0.2f, -13397548)));
            }
        }
        int i15 = boost.multiplier;
        if (i15 > 0) {
            String valueOf = String.valueOf(i15);
            a aVar = this.f46604g0;
            aVar.f46598f = valueOf;
            aVar.e = aVar.f46595a.measureText(valueOf);
            aVar.invalidateSelf();
            u5Var.i(aVar);
        } else {
            u5Var.i(null);
        }
        if (frameLayout.getVisibility() == 0) {
            int L = i0.L(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            if (dd.X) {
                i10 = L;
            } else {
                i10 = 0;
            }
            int paddingTop = u5Var.getPaddingTop();
            if (!dd.X) {
                i11 = L;
            }
            u5Var.setPadding(i10, paddingTop, i11, u5Var.getPaddingBottom());
            return;
        }
        u5Var.setPadding(0, u5Var.getPaddingTop(), 0, u5Var.getPaddingBottom());
    }
}
