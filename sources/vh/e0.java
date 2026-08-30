package vh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class e0 extends y implements a6 {
    public c0 B;
    public final int f45864n;
    public final f6 f45865r;
    public final HorizontalScrollView f45866s;
    public final LinearLayout v;
    public final u1 f45867w;
    public final TextView f45868x;
    public final ArrayList f45869y;

    public e0(Context context, int i10, f6 f6Var) {
        super(context);
        this.f45869y = new ArrayList();
        this.f45864n = i10;
        this.f45865r = f6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f45866s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, b6.e(-1, -1, 23));
        u1 u1Var = new u1(context, R.drawable.msg_add, f6Var);
        u1Var.e = 19;
        u1Var.e();
        this.f45867w = u1Var;
        u1Var.setSelected(true);
        u1Var.setContentDescription(LocaleController.getString(R.string.Add));
        u1Var.setOnClickListener(new View.OnClickListener(this) {
            public final e0 f45792b;

            {
                this.f45792b = this;
            }

            @Override
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (r2) {
                    case 0:
                        e0 e0Var = this.f45792b;
                        c0 c0Var = e0Var.B;
                        if (c0Var != null && (aVar = e0Var.f46283a) != null) {
                            r3 r3Var = ((j3) c0Var).f45959a;
                            r3Var.o3(false);
                            r3Var.f46112e3.l(new o3(r3Var, aVar, -1), view);
                            return;
                        }
                        return;
                    default:
                        e0 e0Var2 = this.f45792b;
                        c0 c0Var2 = e0Var2.B;
                        if (c0Var2 != null && (aVar2 = e0Var2.f46283a) != null) {
                            r3 r3Var2 = ((j3) c0Var2).f45959a;
                            r3Var2.o3(false);
                            r3Var2.f46112e3.l(new o3(r3Var2, aVar2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(u1Var, b6.e(38, 38, 21));
        TextView textView = new TextView(context);
        this.f45868x = textView;
        textView.setText(LocaleController.getString(R.string.RichEditorAddButton));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(7.0f));
        textView.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final e0 f45792b;

            {
                this.f45792b = this;
            }

            @Override
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (r2) {
                    case 0:
                        e0 e0Var = this.f45792b;
                        c0 c0Var = e0Var.B;
                        if (c0Var != null && (aVar = e0Var.f46283a) != null) {
                            r3 r3Var = ((j3) c0Var).f45959a;
                            r3Var.o3(false);
                            r3Var.f46112e3.l(new o3(r3Var, aVar, -1), view);
                            return;
                        }
                        return;
                    default:
                        e0 e0Var2 = this.f45792b;
                        c0 c0Var2 = e0Var2.B;
                        if (c0Var2 != null && (aVar2 = e0Var2.f46283a) != null) {
                            r3 r3Var2 = ((j3) c0Var2).f45959a;
                            r3Var2.o3(false);
                            r3Var2.f46112e3.l(new o3(r3Var2, aVar2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(textView, b6.e(-2, 38, 17));
        j();
    }

    public static boolean h(View view, float f10, float f11) {
        if (view.getVisibility() != 0) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        if (f10 >= i10 && f10 <= view.getWidth() + i10) {
            int i11 = iArr[1];
            if (f11 >= i11 && f11 <= view.getHeight() + i11) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void e() {
        this.f45867w.e();
        j();
        i();
    }

    public int[] getColorKeys() {
        return null;
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: vh.e0.i():void");
    }

    public final void j() {
        int i10 = j6.Oh;
        f6 f6Var = this.f45865r;
        int v02 = j6.v0(i10, f6Var);
        int v = j6.v(j6.v0(j6.f19906d6, f6Var), j6.l1(0.1f, v02));
        TextView textView = this.f45868x;
        textView.setTextColor(v02);
        textView.setBackground(j6.Z(v, j6.l1(0.16f, v02), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_add).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        int dp2;
        int i13;
        int i14;
        int i15;
        int i16;
        int size = View.MeasureSpec.getSize(i10);
        ArrayList arrayList = this.f45869y;
        int size2 = arrayList.size();
        if (size2 > 0 && size2 < 8) {
            i12 = AndroidUtilities.dp(45.0f);
        } else {
            i12 = 0;
        }
        HorizontalScrollView horizontalScrollView = this.f45866s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) horizontalScrollView.getLayoutParams();
        if (layoutParams.rightMargin != i12) {
            layoutParams.rightMargin = i12;
            horizontalScrollView.setLayoutParams(layoutParams);
        }
        if (size2 > 0) {
            int max = Math.max(0, ((size - getPaddingLeft()) - getPaddingRight()) - i12);
            int size3 = arrayList.size();
            if (size3 != 0) {
                int i17 = size3 - 1;
                int max2 = Math.max(0, max - (AndroidUtilities.dp(7.0f) * i17));
                int[] iArr = new int[size3];
                int i18 = 0;
                for (int i19 = 0; i19 < size3; i19++) {
                    b0 b0Var = (b0) arrayList.get(i19);
                    b0Var.getClass();
                    int max3 = Math.max(AndroidUtilities.dp(34.0f), b0Var.f45810a.getPreferredWidth());
                    iArr[i19] = max3;
                    i18 += max3;
                }
                if (i18 <= max2) {
                    boolean[] zArr = new boolean[size3];
                    int i20 = size3;
                    boolean z4 = true;
                    while (z4 && i20 > 0) {
                        int i21 = max2 / i20;
                        int i22 = i20;
                        boolean z10 = false;
                        for (int i23 = 0; i23 < size3; i23++) {
                            if (!zArr[i23] && (i16 = iArr[i23]) > i21) {
                                zArr[i23] = true;
                                max2 -= i16;
                                i22--;
                                z10 = true;
                            }
                        }
                        z4 = z10;
                        i20 = i22;
                    }
                    if (i20 > 0) {
                        int i24 = max2 / i20;
                        int i25 = max2 - (i20 * i24);
                        for (int i26 = 0; i26 < size3; i26++) {
                            if (!zArr[i26]) {
                                int i27 = i25 - 1;
                                if (i25 > 0) {
                                    i15 = 1;
                                } else {
                                    i15 = 0;
                                }
                                iArr[i26] = i15 + i24;
                                i25 = i27;
                            }
                        }
                    }
                } else {
                    int i28 = 0;
                    for (int i29 = 0; i29 < size3; i29++) {
                        int i30 = iArr[i29];
                        b0 b0Var2 = (b0) arrayList.get(i29);
                        b0Var2.getClass();
                        i28 += i30 - Math.max(AndroidUtilities.dp(34.0f), b0Var2.f45810a.getMinWidth());
                    }
                    if (i28 <= 0) {
                        for (int i31 = 0; i31 < size3; i31++) {
                            b0 b0Var3 = (b0) arrayList.get(i31);
                            b0Var3.getClass();
                            iArr[i31] = Math.max(AndroidUtilities.dp(34.0f), b0Var3.f45810a.getMinWidth());
                        }
                    } else {
                        int min = Math.min(i18 - max2, i28);
                        int i32 = 0;
                        int i33 = 0;
                        while (i32 < size3) {
                            int i34 = iArr[i32];
                            b0 b0Var4 = (b0) arrayList.get(i32);
                            b0Var4.getClass();
                            int max4 = i34 - Math.max(AndroidUtilities.dp(34.0f), b0Var4.f45810a.getMinWidth());
                            if (i32 == i17) {
                                i14 = min - i33;
                                i13 = min;
                            } else {
                                i13 = min;
                                i14 = (int) ((min * max4) / i28);
                            }
                            int min2 = Math.min(i14, max4);
                            iArr[i32] = iArr[i32] - min2;
                            i33 += min2;
                            i32++;
                            min = i13;
                        }
                    }
                }
                for (int i35 = 0; i35 < size3; i35++) {
                    b0 b0Var5 = (b0) arrayList.get(i35);
                    int i36 = iArr[i35];
                    RichMessageLayout.RichButton richButton = b0Var5.f45810a;
                    richButton.width = Math.max(AndroidUtilities.dp(34.0f), i36);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) b0Var5.getLayoutParams();
                    if (layoutParams2 != null) {
                        int i37 = layoutParams2.width;
                        int i38 = richButton.width;
                        if (i37 != i38) {
                            layoutParams2.width = i38;
                            b0Var5.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
        }
        if (size2 > 0) {
            dp = ((b0) arrayList.get(0)).f45810a.getHeight();
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
