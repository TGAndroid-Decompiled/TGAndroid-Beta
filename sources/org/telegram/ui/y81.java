package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class y81 extends LinearLayout {
    public final org.telegram.ui.ActionBar.g1[] f40185a;

    public y81(ContextThemeWrapper contextThemeWrapper, final br0 br0Var) {
        super(contextThemeWrapper);
        this.f40185a = r1;
        setOrientation(1);
        org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        c3.c(-328966, -328966);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                br0 br0Var2 = br0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = br0Var2.f32939a;
                        Drawable[] drawableArr = PhotoViewer.Q8;
                        photoViewer.D0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = br0Var2.f32939a;
                        Drawable[] drawableArr2 = PhotoViewer.Q8;
                        photoViewer2.D0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = br0Var2.f32939a;
                        Drawable[] drawableArr3 = PhotoViewer.Q8;
                        photoViewer3.D0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = br0Var2.f32939a;
                        Drawable[] drawableArr4 = PhotoViewer.Q8;
                        photoViewer4.D0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = br0Var2.f32939a;
                        Drawable[] drawableArr5 = PhotoViewer.Q8;
                        photoViewer5.D0(true, true, 2.0f);
                        return;
                }
            }
        });
        c3.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        c10.c(-328966, -328966);
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                br0 br0Var2 = br0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = br0Var2.f32939a;
                        Drawable[] drawableArr = PhotoViewer.Q8;
                        photoViewer.D0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = br0Var2.f32939a;
                        Drawable[] drawableArr2 = PhotoViewer.Q8;
                        photoViewer2.D0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = br0Var2.f32939a;
                        Drawable[] drawableArr3 = PhotoViewer.Q8;
                        photoViewer3.D0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = br0Var2.f32939a;
                        Drawable[] drawableArr4 = PhotoViewer.Q8;
                        photoViewer4.D0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = br0Var2.f32939a;
                        Drawable[] drawableArr5 = PhotoViewer.Q8;
                        photoViewer5.D0(true, true, 2.0f);
                        return;
                }
            }
        });
        c10.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        c11.c(-328966, -328966);
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                br0 br0Var2 = br0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = br0Var2.f32939a;
                        Drawable[] drawableArr = PhotoViewer.Q8;
                        photoViewer.D0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = br0Var2.f32939a;
                        Drawable[] drawableArr2 = PhotoViewer.Q8;
                        photoViewer2.D0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = br0Var2.f32939a;
                        Drawable[] drawableArr3 = PhotoViewer.Q8;
                        photoViewer3.D0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = br0Var2.f32939a;
                        Drawable[] drawableArr4 = PhotoViewer.Q8;
                        photoViewer4.D0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = br0Var2.f32939a;
                        Drawable[] drawableArr5 = PhotoViewer.Q8;
                        photoViewer5.D0(true, true, 2.0f);
                        return;
                }
            }
        });
        c11.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        c12.c(-328966, -328966);
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                br0 br0Var2 = br0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = br0Var2.f32939a;
                        Drawable[] drawableArr = PhotoViewer.Q8;
                        photoViewer.D0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = br0Var2.f32939a;
                        Drawable[] drawableArr2 = PhotoViewer.Q8;
                        photoViewer2.D0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = br0Var2.f32939a;
                        Drawable[] drawableArr3 = PhotoViewer.Q8;
                        photoViewer3.D0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = br0Var2.f32939a;
                        Drawable[] drawableArr4 = PhotoViewer.Q8;
                        photoViewer4.D0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = br0Var2.f32939a;
                        Drawable[] drawableArr5 = PhotoViewer.Q8;
                        photoViewer5.D0(true, true, 2.0f);
                        return;
                }
            }
        });
        c12.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, this, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        c13.c(-328966, -328966);
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                br0 br0Var2 = br0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = br0Var2.f32939a;
                        Drawable[] drawableArr = PhotoViewer.Q8;
                        photoViewer.D0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = br0Var2.f32939a;
                        Drawable[] drawableArr2 = PhotoViewer.Q8;
                        photoViewer2.D0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = br0Var2.f32939a;
                        Drawable[] drawableArr3 = PhotoViewer.Q8;
                        photoViewer3.D0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = br0Var2.f32939a;
                        Drawable[] drawableArr4 = PhotoViewer.Q8;
                        photoViewer4.D0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = br0Var2.f32939a;
                        Drawable[] drawableArr5 = PhotoViewer.Q8;
                        photoViewer5.D0(true, true, 2.0f);
                        return;
                }
            }
        });
        c13.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.g1[] g1VarArr = {c3, c10, c11, c12, c13};
        View h51Var = new h51(contextThemeWrapper, 1);
        h51Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        h51Var.setBackgroundColor(-15198184);
        addView(h51Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h51Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        h51Var.setLayoutParams(layoutParams);
    }
}
