package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

public final class e0 extends y implements org.telegram.ui.ActionBar.x5 {
    public c0 A;

    public final int f47113n;

    public final c6 f47114r;

    public final HorizontalScrollView f47115s;
    public final LinearLayout v;

    public final t1 f47116w;

    public final TextView f47117x;

    public final ArrayList f47118y;

    public e0(Context context, int i10, c6 c6Var) {
        super(context);
        this.f47118y = new ArrayList();
        this.f47113n = i10;
        this.f47114r = c6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f47115s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, z5.e(-1, -1, 23));
        t1 t1Var = new t1(context, R.drawable.msg_add, c6Var);
        t1Var.f47459e = 19;
        t1Var.d();
        this.f47116w = t1Var;
        t1Var.setSelected(true);
        t1Var.setContentDescription(LocaleController.getString(R.string.Add));
        final int i11 = 0;
        t1Var.setOnClickListener(new View.OnClickListener(this) {

            public final e0 f47046b;

            {
                this.f47046b = this;
            }

            @Override
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (i11) {
                    case 0:
                        e0 e0Var = this.f47046b;
                        c0 c0Var = e0Var.A;
                        if (c0Var != null && (aVar = e0Var.f47594a) != null) {
                            p3 p3Var = ((h3) c0Var).f47181a;
                            p3Var.o3(false);
                            p3Var.f47340d3.C(new m3(p3Var, aVar, -1), view);
                            break;
                        }
                        break;
                    default:
                        e0 e0Var2 = this.f47046b;
                        c0 c0Var2 = e0Var2.A;
                        if (c0Var2 != null && (aVar2 = e0Var2.f47594a) != null) {
                            p3 p3Var2 = ((h3) c0Var2).f47181a;
                            p3Var2.o3(false);
                            p3Var2.f47340d3.C(new m3(p3Var2, aVar2, -1), view);
                            break;
                        }
                        break;
                }
            }
        });
        addView(t1Var, z5.e(38, 38, 21));
        TextView textView = new TextView(context);
        this.f47117x = textView;
        textView.setText(LocaleController.getString(R.string.RichEditorAddButton));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(7.0f));
        textView.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        final int i12 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) {

            public final e0 f47046b;

            {
                this.f47046b = this;
            }

            @Override
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (i12) {
                    case 0:
                        e0 e0Var = this.f47046b;
                        c0 c0Var = e0Var.A;
                        if (c0Var != null && (aVar = e0Var.f47594a) != null) {
                            p3 p3Var = ((h3) c0Var).f47181a;
                            p3Var.o3(false);
                            p3Var.f47340d3.C(new m3(p3Var, aVar, -1), view);
                            break;
                        }
                        break;
                    default:
                        e0 e0Var2 = this.f47046b;
                        c0 c0Var2 = e0Var2.A;
                        if (c0Var2 != null && (aVar2 = e0Var2.f47594a) != null) {
                            p3 p3Var2 = ((h3) c0Var2).f47181a;
                            p3Var2.o3(false);
                            p3Var2.f47340d3.C(new m3(p3Var2, aVar2, -1), view);
                            break;
                        }
                        break;
                }
            }
        });
        addView(textView, z5.e(-2, 38, 17));
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
    public final void d() {
        this.f47116w.d();
        j();
        i();
    }

    public int[] getColorKeys() {
        return null;
    }

    public final void i() {
        TL_iv.pageBlockButtonRow pageblockbuttonrow;
        ArrayList<TL_keyboard.PageButton> arrayList;
        LinearLayout linearLayout = this.v;
        linearLayout.removeAllViews();
        ArrayList arrayList2 = this.f47118y;
        arrayList2.clear();
        a aVar = this.f47594a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f47028b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
            } else {
                pageblockbuttonrow = null;
            }
        } else {
            pageblockbuttonrow = null;
        }
        int size = (pageblockbuttonrow == null || (arrayList = pageblockbuttonrow.buttons) == null) ? 0 : arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            b0 b0Var = new b0(this, getContext(), pageblockbuttonrow.buttons.get(i10), i10);
            arrayList2.add(b0Var);
            linearLayout.addView(b0Var, z5.t(-2, -1, 16, i10 == 0 ? 0 : 7, 0, 0, 0));
            i10++;
        }
        boolean z10 = size < 8;
        this.f47115s.setVisibility(size > 0 ? 0 : 8);
        this.f47117x.setVisibility(size == 0 ? 0 : 8);
        this.f47116w.setVisibility((size <= 0 || !z10) ? 8 : 0);
        requestLayout();
    }

    public final void j() {
        int i10 = g6.Oh;
        c6 c6Var = this.f47114r;
        int iV0 = g6.v0(i10, c6Var);
        int iV = g6.v(g6.v0(g6.f23053d6, c6Var), g6.l1(0.1f, iV0));
        TextView textView = this.f47117x;
        textView.setTextColor(iV0);
        textView.setBackground(g6.Z(iV, g6.l1(0.16f, iV0), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_add).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(iV0, PorterDuff.Mode.SRC_IN));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableMutate, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iDp;
        int iDp2;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        ArrayList arrayList = this.f47118y;
        int size2 = arrayList.size();
        int iDp3 = (size2 <= 0 || size2 >= 8) ? 0 : AndroidUtilities.dp(45.0f);
        HorizontalScrollView horizontalScrollView = this.f47115s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) horizontalScrollView.getLayoutParams();
        if (layoutParams.rightMargin != iDp3) {
            layoutParams.rightMargin = iDp3;
            horizontalScrollView.setLayoutParams(layoutParams);
        }
        if (size2 > 0) {
            int iMax = Math.max(0, ((size - getPaddingLeft()) - getPaddingRight()) - iDp3);
            int size3 = arrayList.size();
            if (size3 != 0) {
                int i13 = size3 - 1;
                int iMax2 = Math.max(0, iMax - (AndroidUtilities.dp(7.0f) * i13));
                int[] iArr = new int[size3];
                int i14 = 0;
                for (int i15 = 0; i15 < size3; i15++) {
                    b0 b0Var = (b0) arrayList.get(i15);
                    b0Var.getClass();
                    int iMax3 = Math.max(AndroidUtilities.dp(34.0f), b0Var.f47057a.getPreferredWidth());
                    iArr[i15] = iMax3;
                    i14 += iMax3;
                }
                if (i14 <= iMax2) {
                    boolean[] zArr = new boolean[size3];
                    int i16 = size3;
                    boolean z10 = true;
                    while (z10 && i16 > 0) {
                        int i17 = iMax2 / i16;
                        int i18 = i16;
                        boolean z11 = false;
                        for (int i19 = 0; i19 < size3; i19++) {
                            if (!zArr[i19] && (i12 = iArr[i19]) > i17) {
                                zArr[i19] = true;
                                iMax2 -= i12;
                                i18--;
                                z11 = true;
                            }
                        }
                        z10 = z11;
                        i16 = i18;
                    }
                    if (i16 > 0) {
                        int i20 = iMax2 / i16;
                        int i21 = iMax2 - (i16 * i20);
                        for (int i22 = 0; i22 < size3; i22++) {
                            if (!zArr[i22]) {
                                int i23 = i21 - 1;
                                iArr[i22] = (i21 > 0 ? 1 : 0) + i20;
                                i21 = i23;
                            }
                        }
                    }
                } else {
                    int iMax4 = 0;
                    for (int i24 = 0; i24 < size3; i24++) {
                        int i25 = iArr[i24];
                        b0 b0Var2 = (b0) arrayList.get(i24);
                        b0Var2.getClass();
                        iMax4 += i25 - Math.max(AndroidUtilities.dp(34.0f), b0Var2.f47057a.getMinWidth());
                    }
                    if (iMax4 <= 0) {
                        for (int i26 = 0; i26 < size3; i26++) {
                            b0 b0Var3 = (b0) arrayList.get(i26);
                            b0Var3.getClass();
                            iArr[i26] = Math.max(AndroidUtilities.dp(34.0f), b0Var3.f47057a.getMinWidth());
                        }
                    } else {
                        int iMin = Math.min(i14 - iMax2, iMax4);
                        int i27 = 0;
                        int i28 = 0;
                        while (i27 < size3) {
                            int i29 = iArr[i27];
                            b0 b0Var4 = (b0) arrayList.get(i27);
                            b0Var4.getClass();
                            int iMax5 = i29 - Math.max(AndroidUtilities.dp(34.0f), b0Var4.f47057a.getMinWidth());
                            int iMin2 = Math.min(i27 == i13 ? iMin - i28 : (int) ((((long) iMin) * ((long) iMax5)) / ((long) iMax4)), iMax5);
                            iArr[i27] = iArr[i27] - iMin2;
                            i28 += iMin2;
                            i27++;
                            iMin = iMin;
                        }
                    }
                }
                for (int i30 = 0; i30 < size3; i30++) {
                    b0 b0Var5 = (b0) arrayList.get(i30);
                    int i31 = iArr[i30];
                    RichMessageLayout.RichButton richButton = b0Var5.f47057a;
                    richButton.width = Math.max(AndroidUtilities.dp(34.0f), i31);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) b0Var5.getLayoutParams();
                    if (layoutParams2 != null) {
                        int i32 = layoutParams2.width;
                        int i33 = richButton.width;
                        if (i32 != i33) {
                            layoutParams2.width = i33;
                            b0Var5.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
        }
        if (size2 > 0) {
            iDp = ((b0) arrayList.get(0)).f47057a.getHeight();
            iDp2 = AndroidUtilities.dp(8.0f);
        } else {
            iDp = AndroidUtilities.dp(SharedConfig.fontSize + 18);
            iDp2 = AndroidUtilities.dp(8.0f);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iDp2 + iDp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        setMeasuredDimension(size, paddingBottom);
    }
}
