package qh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public final class e0 extends y implements org.telegram.ui.ActionBar.w5 {
    public c0 A;
    public final int f46355n;
    public final b6 f46356r;
    public final HorizontalScrollView f46357s;
    public final LinearLayout v;
    public final t1 f46358w;
    public final TextView f46359x;
    public final ArrayList f46360y;

    public e0(Context context, int i9, b6 b6Var) {
        super(context);
        this.f46360y = new ArrayList();
        this.f46355n = i9;
        this.f46356r = b6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f46357s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, e6.e(-1, -1, 23));
        t1 t1Var = new t1(context, R.drawable.msg_add, b6Var);
        t1Var.f46717e = 19;
        t1Var.d();
        this.f46358w = t1Var;
        t1Var.setSelected(true);
        t1Var.setContentDescription(LocaleController.getString(R.string.Add));
        t1Var.setOnClickListener(new View.OnClickListener(this) {
            public final e0 f46287b;

            {
                this.f46287b = this;
            }

            @Override
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (r2) {
                    case 0:
                        e0 e0Var = this.f46287b;
                        c0 c0Var = e0Var.A;
                        if (c0Var != null && (aVar = e0Var.f46834a) != null) {
                            o3 o3Var = ((g3) c0Var).f46405a;
                            o3Var.o3(false);
                            o3Var.f46565d3.d2(new l3(o3Var, aVar, -1), view);
                            return;
                        }
                        return;
                    default:
                        e0 e0Var2 = this.f46287b;
                        c0 c0Var2 = e0Var2.A;
                        if (c0Var2 != null && (aVar2 = e0Var2.f46834a) != null) {
                            o3 o3Var2 = ((g3) c0Var2).f46405a;
                            o3Var2.o3(false);
                            o3Var2.f46565d3.d2(new l3(o3Var2, aVar2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(t1Var, e6.e(38, 38, 21));
        TextView textView = new TextView(context);
        this.f46359x = textView;
        textView.setText(LocaleController.getString(R.string.RichEditorAddButton));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(7.0f));
        textView.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final e0 f46287b;

            {
                this.f46287b = this;
            }

            @Override
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (r2) {
                    case 0:
                        e0 e0Var = this.f46287b;
                        c0 c0Var = e0Var.A;
                        if (c0Var != null && (aVar = e0Var.f46834a) != null) {
                            o3 o3Var = ((g3) c0Var).f46405a;
                            o3Var.o3(false);
                            o3Var.f46565d3.d2(new l3(o3Var, aVar, -1), view);
                            return;
                        }
                        return;
                    default:
                        e0 e0Var2 = this.f46287b;
                        c0 c0Var2 = e0Var2.A;
                        if (c0Var2 != null && (aVar2 = e0Var2.f46834a) != null) {
                            o3 o3Var2 = ((g3) c0Var2).f46405a;
                            o3Var2.o3(false);
                            o3Var2.f46565d3.d2(new l3(o3Var2, aVar2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(textView, e6.e(-2, 38, 17));
        j();
    }

    public static boolean h(View view, float f10, float f11) {
        if (view.getVisibility() != 0) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i9 = iArr[0];
        if (f10 >= i9 && f10 <= view.getWidth() + i9) {
            int i10 = iArr[1];
            if (f11 >= i10 && f11 <= view.getHeight() + i10) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void d() {
        this.f46358w.d();
        j();
        i();
    }

    public int[] getColorKeys() {
        return null;
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: qh.e0.i():void");
    }

    public final void j() {
        int i9 = f6.Oh;
        b6 b6Var = this.f46356r;
        int v02 = f6.v0(i9, b6Var);
        int v = f6.v(f6.v0(f6.f23001d6, b6Var), f6.l1(0.1f, v02));
        TextView textView = this.f46359x;
        textView.setTextColor(v02);
        textView.setBackground(f6.Z(v, f6.l1(0.16f, v02), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_add).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int dp;
        int dp2;
        int i12;
        int i13;
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i9);
        ArrayList arrayList = this.f46360y;
        int size2 = arrayList.size();
        if (size2 > 0 && size2 < 8) {
            i11 = AndroidUtilities.dp(45.0f);
        } else {
            i11 = 0;
        }
        HorizontalScrollView horizontalScrollView = this.f46357s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) horizontalScrollView.getLayoutParams();
        if (layoutParams.rightMargin != i11) {
            layoutParams.rightMargin = i11;
            horizontalScrollView.setLayoutParams(layoutParams);
        }
        if (size2 > 0) {
            int max = Math.max(0, ((size - getPaddingLeft()) - getPaddingRight()) - i11);
            int size3 = arrayList.size();
            if (size3 != 0) {
                int i16 = size3 - 1;
                int max2 = Math.max(0, max - (AndroidUtilities.dp(7.0f) * i16));
                int[] iArr = new int[size3];
                int i17 = 0;
                for (int i18 = 0; i18 < size3; i18++) {
                    b0 b0Var = (b0) arrayList.get(i18);
                    b0Var.getClass();
                    int max3 = Math.max(AndroidUtilities.dp(34.0f), b0Var.f46299a.getPreferredWidth());
                    iArr[i18] = max3;
                    i17 += max3;
                }
                if (i17 <= max2) {
                    boolean[] zArr = new boolean[size3];
                    int i19 = size3;
                    boolean z10 = true;
                    while (z10 && i19 > 0) {
                        int i20 = max2 / i19;
                        int i21 = i19;
                        boolean z11 = false;
                        for (int i22 = 0; i22 < size3; i22++) {
                            if (!zArr[i22] && (i15 = iArr[i22]) > i20) {
                                zArr[i22] = true;
                                max2 -= i15;
                                i21--;
                                z11 = true;
                            }
                        }
                        z10 = z11;
                        i19 = i21;
                    }
                    if (i19 > 0) {
                        int i23 = max2 / i19;
                        int i24 = max2 - (i19 * i23);
                        for (int i25 = 0; i25 < size3; i25++) {
                            if (!zArr[i25]) {
                                int i26 = i24 - 1;
                                if (i24 > 0) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                iArr[i25] = i14 + i23;
                                i24 = i26;
                            }
                        }
                    }
                } else {
                    int i27 = 0;
                    for (int i28 = 0; i28 < size3; i28++) {
                        int i29 = iArr[i28];
                        b0 b0Var2 = (b0) arrayList.get(i28);
                        b0Var2.getClass();
                        i27 += i29 - Math.max(AndroidUtilities.dp(34.0f), b0Var2.f46299a.getMinWidth());
                    }
                    if (i27 <= 0) {
                        for (int i30 = 0; i30 < size3; i30++) {
                            b0 b0Var3 = (b0) arrayList.get(i30);
                            b0Var3.getClass();
                            iArr[i30] = Math.max(AndroidUtilities.dp(34.0f), b0Var3.f46299a.getMinWidth());
                        }
                    } else {
                        int min = Math.min(i17 - max2, i27);
                        int i31 = 0;
                        int i32 = 0;
                        while (i31 < size3) {
                            int i33 = iArr[i31];
                            b0 b0Var4 = (b0) arrayList.get(i31);
                            b0Var4.getClass();
                            int max4 = i33 - Math.max(AndroidUtilities.dp(34.0f), b0Var4.f46299a.getMinWidth());
                            if (i31 == i16) {
                                i13 = min - i32;
                                i12 = min;
                            } else {
                                i12 = min;
                                i13 = (int) ((min * max4) / i27);
                            }
                            int min2 = Math.min(i13, max4);
                            iArr[i31] = iArr[i31] - min2;
                            i32 += min2;
                            i31++;
                            min = i12;
                        }
                    }
                }
                for (int i34 = 0; i34 < size3; i34++) {
                    b0 b0Var5 = (b0) arrayList.get(i34);
                    int i35 = iArr[i34];
                    RichMessageLayout.RichButton richButton = b0Var5.f46299a;
                    richButton.width = Math.max(AndroidUtilities.dp(34.0f), i35);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) b0Var5.getLayoutParams();
                    if (layoutParams2 != null) {
                        int i36 = layoutParams2.width;
                        int i37 = richButton.width;
                        if (i36 != i37) {
                            layoutParams2.width = i37;
                            b0Var5.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
        }
        if (size2 > 0) {
            dp = ((b0) arrayList.get(0)).f46299a.getHeight();
            dp2 = AndroidUtilities.dp(8.0f);
        } else {
            dp = AndroidUtilities.dp(SharedConfig.fontSize + 18);
            dp2 = AndroidUtilities.dp(8.0f);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + dp2 + dp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        setMeasuredDimension(size, paddingBottom);
    }
}
