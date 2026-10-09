package vg;

import ai.l2;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.y9;
import w7.x5;
public final class c0 extends FrameLayout {
    public final TextView f49579a;
    public final TextView f49580b;
    public final TextView f49581c;
    public final TextView d;
    public final TextView f49582e;
    public final y9 f49583f;
    public final y9 h;
    public final e6 f49584n;
    public final Paint f49585r;
    public final Path f49586s;
    public final RectF v;
    public final FrameLayout f49587w;
    public final FrameLayout f49588x;
    public final TableRow f49589y;

    public c0(Context context, e6 e6Var) {
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
        this.f49585r = paint;
        this.f49586s = new Path();
        this.v = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        this.f49584n = e6Var;
        TextView a2 = a(LocaleController.getString(R.string.BoostingFrom), false);
        TextView a10 = a(LocaleController.getString(R.string.BoostingTo), false);
        TextView a11 = a(LocaleController.getString(R.string.BoostingGift), false);
        TextView a12 = a(LocaleController.getString(R.string.BoostingReason), false);
        TextView a13 = a(LocaleController.getString(R.string.BoostingDate), false);
        TextView a14 = a(null, true);
        this.f49579a = a14;
        TextView a15 = a(null, true);
        this.f49580b = a15;
        TextView a16 = a(null, false);
        this.f49581c = a16;
        TextView a17 = a(null, true);
        this.d = a17;
        TextView a18 = a(null, false);
        this.f49582e = a18;
        y9 y9Var = new y9(context);
        this.f49583f = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        y9 y9Var2 = new y9(context);
        this.h = y9Var2;
        y9Var2.setRoundRadius(AndroidUtilities.dp(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49587w = frameLayout;
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
        frameLayout.addView(y9Var, x5.a(24.0f, f7, 0.0f, f10, 0.0f, 24, i10));
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
        frameLayout.addView(a14, x5.a(-2.0f, f11, 0.0f, f12, 0.0f, -2, i13));
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
        this.f49588x = frameLayout2;
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
        frameLayout2.addView(y9Var2, x5.a(24.0f, f14, 0.0f, f15, 0.0f, 24, i12));
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
        frameLayout2.addView(a15, x5.a(-2.0f, f16, 0.0f, f17, 0.0f, -2, i14));
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
        this.f49589y = tableRow4;
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
        b0 b0Var = new b0(this, context, e6Var);
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
        addView(b0Var, x5.d(-2.0f, -1));
        b0Var.setOutlineProvider(new l2(22));
        b0Var.setClipToOutline(z10);
        setPaddingRelative(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), 0);
    }

    public final TextView a(String str, boolean z10) {
        TextView textView;
        int i10;
        float f7;
        int i11;
        e6 e6Var = this.f49584n;
        if (z10) {
            textView = new ea0(getContext(), e6Var);
            textView.setLinkTextColor(i6.w0(i6.J6, e6Var));
        } else {
            textView = new TextView(getContext());
        }
        if (z10) {
            i10 = i6.f20961m5;
        } else {
            i10 = i6.f20905j5;
        }
        bi.o(i10, e6Var, textView, 1, 14.0f);
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
            textView.setBackgroundColor(i6.w0(i6.e7, e6Var));
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
