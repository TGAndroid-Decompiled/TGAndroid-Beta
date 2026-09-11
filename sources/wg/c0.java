package wg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;
import bi.z1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.vl;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.x9;
import w7.x5;
public final class c0 extends FrameLayout {
    public final TextView f48511a;
    public final TextView f48512b;
    public final TextView f48513c;
    public final TextView d;
    public final TextView f48514e;
    public final x9 f48515f;
    public final x9 h;
    public final f6 f48516n;
    public final Paint f48517r;
    public final Path f48518s;
    public final RectF v;
    public final FrameLayout f48519w;
    public final FrameLayout f48520x;
    public final TableRow f48521y;

    public c0(Context context, f6 f6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        float f11;
        float f12;
        float f13;
        int i12;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        boolean z10;
        Paint paint = new Paint();
        this.f48517r = paint;
        this.f48518s = new Path();
        this.v = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        this.f48516n = f6Var;
        TextView a2 = a(LocaleController.getString(R.string.BoostingFrom), false);
        TextView a10 = a(LocaleController.getString(R.string.BoostingTo), false);
        TextView a11 = a(LocaleController.getString(R.string.BoostingGift), false);
        TextView a12 = a(LocaleController.getString(R.string.BoostingReason), false);
        TextView a13 = a(LocaleController.getString(R.string.BoostingDate), false);
        TextView a14 = a(null, true);
        this.f48511a = a14;
        TextView a15 = a(null, true);
        this.f48512b = a15;
        TextView a16 = a(null, false);
        this.f48513c = a16;
        TextView a17 = a(null, true);
        this.d = a17;
        TextView a18 = a(null, false);
        this.f48514e = a18;
        x9 x9Var = new x9(context);
        this.f48515f = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        x9 x9Var2 = new x9(context);
        this.h = x9Var2;
        x9Var2.setRoundRadius(AndroidUtilities.dp(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48519w = frameLayout;
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        if (z11) {
            f7 = 0.0f;
        } else {
            f7 = 12.0f;
        }
        if (z11) {
            f10 = 12.0f;
        } else {
            f10 = 0.0f;
        }
        frameLayout.addView(x9Var, x5.d(24, 24.0f, i10, f7, 0.0f, f10, 0.0f));
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i13 = i11 | 16;
        if (z12) {
            f11 = 0.0f;
        } else {
            f11 = 29.0f;
        }
        if (z12) {
            f12 = 29.0f;
        } else {
            f12 = 0.0f;
        }
        frameLayout.addView(a14, x5.d(-2, -2.0f, i13, f11, 0.0f, f12, 0.0f));
        if (LocaleController.isRTL) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -2, f13);
        layoutParams.gravity = 16;
        if (LocaleController.isRTL) {
            tableRow.addView(frameLayout, layoutParams);
            tableRow.addView(a2, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow.addView(a2, new TableRow.LayoutParams(-2, -2));
            tableRow.addView(frameLayout, layoutParams);
        }
        frameLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        TableRow tableRow2 = new TableRow(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f48520x = frameLayout2;
        boolean z13 = LocaleController.isRTL;
        if (z13) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        if (z13) {
            f14 = 0.0f;
        } else {
            f14 = 12.0f;
        }
        if (z13) {
            f15 = 12.0f;
        } else {
            f15 = 0.0f;
        }
        frameLayout2.addView(x9Var2, x5.d(24, 24.0f, i12, f14, 0.0f, f15, 0.0f));
        boolean z14 = LocaleController.isRTL;
        int i14 = (z14 ? 5 : 3) | 16;
        if (z14) {
            f16 = 0.0f;
        } else {
            f16 = 29.0f;
        }
        if (z14) {
            f17 = 29.0f;
        } else {
            f17 = 0.0f;
        }
        frameLayout2.addView(a15, x5.d(-2, -2.0f, i14, f16, 0.0f, f17, 0.0f));
        if (LocaleController.isRTL) {
            f18 = 1.0f;
        } else {
            f18 = 0.0f;
        }
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-2, -2, f18);
        layoutParams2.gravity = 16;
        if (LocaleController.isRTL) {
            tableRow2.addView(frameLayout2, layoutParams2);
            tableRow2.addView(a10, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow2.addView(a10, new TableRow.LayoutParams(-2, -2));
            tableRow2.addView(frameLayout2, layoutParams2);
        }
        frameLayout2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        TableRow tableRow3 = new TableRow(context);
        if (LocaleController.isRTL) {
            tableRow3.addView(a16, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow3.addView(a11, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow3.addView(a11, new TableRow.LayoutParams(-2, -2));
            tableRow3.addView(a16, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow4 = new TableRow(context);
        this.f48521y = tableRow4;
        if (LocaleController.isRTL) {
            tableRow4.addView(a17, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow4.addView(a12, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow4.addView(a12, new TableRow.LayoutParams(-2, -2));
            tableRow4.addView(a17, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow5 = new TableRow(context);
        if (LocaleController.isRTL) {
            tableRow5.addView(a18, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow5.addView(a13, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow5.addView(a13, new TableRow.LayoutParams(-2, -2));
            tableRow5.addView(a18, new TableRow.LayoutParams(-2, -2));
        }
        b0 b0Var = new b0(this, context, f6Var);
        b0Var.addView(tableRow);
        b0Var.addView(tableRow2);
        b0Var.addView(tableRow3);
        b0Var.addView(tableRow4);
        b0Var.addView(tableRow5);
        if (LocaleController.isRTL) {
            z10 = true;
            b0Var.setColumnShrinkable(0, true);
        } else {
            z10 = true;
            b0Var.setColumnShrinkable(1, true);
        }
        addView(b0Var, x5.c(-2.0f, -1));
        b0Var.setOutlineProvider(new z1(20));
        b0Var.setClipToOutline(z10);
        setPaddingRelative(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), 0);
    }

    public final TextView a(String str, boolean z10) {
        TextView textView;
        int i10;
        float f7;
        int i11;
        f6 f6Var = this.f48516n;
        if (z10) {
            textView = new d90(getContext(), f6Var);
            textView.setLinkTextColor(j6.v0(j6.J6, f6Var));
        } else {
            textView = new TextView(getContext());
        }
        if (z10) {
            i10 = j6.f20826m5;
        } else {
            i10 = j6.f20770j5;
        }
        vl.n(i10, f6Var, textView, 1, 14.0f);
        if (!z10) {
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView.setGravity(i11);
        }
        if (str != null) {
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(str);
            textView.setBackgroundColor(j6.v0(j6.e7, f6Var));
            float f10 = 12.0f;
            if (LocaleController.isRTL) {
                f7 = 32.0f;
            } else {
                f7 = 12.0f;
            }
            int dp = AndroidUtilities.dp(f7);
            int dp2 = AndroidUtilities.dp(11.0f);
            if (!LocaleController.isRTL) {
                f10 = 32.0f;
            }
            textView.setPadding(dp, dp2, AndroidUtilities.dp(f10), AndroidUtilities.dp(11.0f));
            return textView;
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        return textView;
    }
}
