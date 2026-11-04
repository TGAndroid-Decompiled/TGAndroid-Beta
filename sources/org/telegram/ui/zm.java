package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zm extends Drawable {
    public final boolean f52706a;
    public View f52707b;
    public int f52708c = 255;
    public final float d;
    public final ei.c3 f52709e;
    public final org.telegram.ui.Components.la0 f52710f;
    public final TLRPC.WallPaper f52711g;
    public boolean h;
    public boolean f52712i;
    public final ArrayList f52713j;

    public zm(TLRPC.WallPaper wallPaper, boolean z10, boolean z11) {
        TLRPC.WallPaperSettings wallPaperSettings;
        String o10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        ei.c3 c3Var = new ei.c3(this, 3);
        this.f52709e = c3Var;
        this.f52713j = new ArrayList();
        c3Var.K0 = true;
        boolean z12 = wallPaper.pattern;
        this.f52711g = wallPaper;
        this.f52706a = z10;
        if (z10 && ((wallPaper.document != null || wallPaper.uploadingImage != null) && !z12 && (wallPaperSettings2 = wallPaper.settings) != null)) {
            this.d = wallPaperSettings2.intensity / 100.0f;
        }
        if ((z12 || wallPaper.document == null) && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.second_background_color != 0 && wallPaperSettings.third_background_color != 0) {
            org.telegram.ui.Components.la0 la0Var = new org.telegram.ui.Components.la0();
            this.f52710f = la0Var;
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            la0Var.n(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            org.telegram.ui.ActionBar.p3.o(org.telegram.messenger.h10.f22829t0, wallPaper.f27155id, wallPaper, new mi.f(25, this, wallPaper));
            return;
        }
        Point point = org.telegram.messenger.g0.f22608q;
        int min = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        if (z11) {
            o10 = "150_150_wallpaper";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / org.telegram.messenger.g0.f22607p));
            sb2.append("_");
            o10 = a1.g.o((int) (max / org.telegram.messenger.g0.f22607p), "_wallpaper", sb2);
        }
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l(o10);
        l10.append(wallPaper.f27155id);
        StringBuilder l11 = com.google.android.recaptcha.internal.a.l(l10.toString());
        l11.append(e(wallPaper.settings));
        String sb3 = l11.toString();
        Drawable b10 = b(wallPaper);
        String str = wallPaper.uploadingImage;
        if (str != null) {
            c3Var.q0(org.telegram.messenger.ac.g(str), sb3, b10, null, wallPaper, 1);
            return;
        }
        TLRPC.Document document = wallPaper.document;
        if (document != null) {
            c3Var.q0(org.telegram.messenger.ac.b(document), sb3, b10, null, wallPaper, 1);
        } else {
            c3Var.w0(b10);
        }
    }

    public static BitmapDrawable a(Drawable drawable) {
        Bitmap createBitmap = Bitmap.createBitmap(20, 20, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, 20, 20);
        drawable.draw(canvas);
        return new BitmapDrawable(createBitmap);
    }

    public static Drawable b(TLRPC.WallPaper wallPaper) {
        BitmapDrawable a10;
        Drawable drawable = wallPaper.thumbDrawable;
        if (drawable != null) {
            return drawable;
        }
        if (wallPaper.stripedThumb != null) {
            return new BitmapDrawable(wallPaper.stripedThumb);
        }
        if (wallPaper.pattern && wallPaper.settings == null) {
            return new ColorDrawable(-16777216);
        }
        int i3 = 0;
        if (wallPaper.document != null) {
            a10 = null;
            while (i3 < wallPaper.document.thumbs.size()) {
                if (wallPaper.document.thumbs.get(i3) instanceof TLRPC.TL_photoStrippedSize) {
                    a10 = new BitmapDrawable(org.telegram.messenger.zb.F("b", wallPaper.document.thumbs.get(i3).bytes));
                }
                i3++;
            }
        } else {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings != null && wallPaperSettings.intensity >= 0) {
                if (wallPaperSettings.second_background_color == 0) {
                    a10 = a(new ColorDrawable(i0.a.o(wallPaper.settings.background_color, 255)));
                } else if (wallPaperSettings.third_background_color == 0) {
                    a10 = a(new GradientDrawable(org.telegram.ui.Components.j9.d(wallPaper.settings.rotation), new int[]{i0.a.o(wallPaperSettings.background_color, 255), i0.a.o(wallPaper.settings.second_background_color, 255)}));
                } else {
                    int o10 = i0.a.o(wallPaperSettings.background_color, 255);
                    int o11 = i0.a.o(wallPaper.settings.second_background_color, 255);
                    int o12 = i0.a.o(wallPaper.settings.third_background_color, 255);
                    int i10 = wallPaper.settings.fourth_background_color;
                    if (i10 != 0) {
                        i3 = i0.a.o(i10, 255);
                    }
                    org.telegram.ui.Components.la0 la0Var = new org.telegram.ui.Components.la0();
                    la0Var.n(o10, o11, o12, i3);
                    a10 = new BitmapDrawable(la0Var.f35658k);
                }
            } else {
                a10 = a(new ColorDrawable(-16777216));
            }
        }
        wallPaper.thumbDrawable = a10;
        return a10;
    }

    public static zm d(Drawable drawable, TLRPC.WallPaper wallPaper, boolean z10) {
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaperSettings wallPaperSettings2;
        if (drawable instanceof zm) {
            zm zmVar = (zm) drawable;
            boolean z11 = zmVar.f52706a;
            TLRPC.WallPaper wallPaper2 = zmVar.f52711g;
            String str = wallPaper.uploadingImage;
            if (str == null ? !(wallPaper.f27155id != wallPaper2.f27155id || !TextUtils.equals(e(wallPaper.settings), e(wallPaper2.settings)) || (wallPaper.document != null && !wallPaper.pattern && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.intensity > 0 && z11 != z10)) : !(!str.equals(wallPaper2.uploadingImage) || ((wallPaperSettings2 = wallPaper.settings) != null && wallPaper2.settings != null && wallPaperSettings2.intensity > 0 && z11 != z10))) {
                return zmVar;
            }
        }
        return new zm(wallPaper, z10, false);
    }

    public static String e(TLRPC.WallPaperSettings wallPaperSettings) {
        if (wallPaperSettings == null) {
            return "";
        }
        return String.valueOf(Objects.hash(Boolean.valueOf(wallPaperSettings.blur), Boolean.valueOf(wallPaperSettings.motion), Integer.valueOf(wallPaperSettings.intensity), Integer.valueOf(wallPaperSettings.background_color), Integer.valueOf(wallPaperSettings.second_background_color), Integer.valueOf(wallPaperSettings.third_background_color), Integer.valueOf(wallPaperSettings.fourth_background_color)));
    }

    public final Drawable c(boolean z10) {
        Drawable drawable;
        org.telegram.ui.Components.la0 la0Var = this.f52710f;
        if (la0Var != null) {
            return la0Var;
        }
        ei.c3 c3Var = this.f52709e;
        if (z10 && (drawable = c3Var.f21256n0) != null) {
            return drawable;
        }
        Drawable drawable2 = c3Var.f21231b0;
        if (drawable2 != null) {
            return drawable2;
        }
        if (c3Var.t() != null) {
            return c3Var.t();
        }
        return c3Var.f21256n0;
    }

    @Override
    public final void draw(Canvas canvas) {
        org.telegram.ui.Components.la0 la0Var = this.f52710f;
        if (la0Var != null) {
            la0Var.setBounds(getBounds());
            la0Var.setAlpha(this.f52708c);
            la0Var.draw(canvas);
            return;
        }
        ei.c3 c3Var = this.f52709e;
        boolean J = c3Var.J();
        float f10 = this.d;
        boolean z10 = true;
        if (J && c3Var.f21249i1 == 1.0f) {
            if (!this.h) {
                this.h = true;
                c3Var.f21261p1 = new PorterDuffColorFilter(i0.a.o(-16777216, (int) (f10 * 255.0f)), PorterDuff.Mode.DARKEN);
            }
            z10 = false;
        }
        c3Var.z0(getBounds());
        c3Var.setAlpha(this.f52708c / 255.0f);
        c3Var.h(canvas, null);
        if (z10 && f10 != 0.0f) {
            canvas.drawColor(i0.a.o(-16777216, (int) (f10 * 255.0f)));
        }
    }

    public final void f(View view) {
        ArrayList arrayList = this.f52713j;
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
        int size = arrayList.size();
        ei.c3 c3Var = this.f52709e;
        if (size > 0 && !this.f52712i) {
            this.f52712i = true;
            c3Var.P();
        } else if (arrayList.size() <= 0 && this.f52712i) {
            this.f52712i = false;
            c3Var.R();
        }
        org.telegram.ui.Components.la0 la0Var = this.f52710f;
        if (la0Var != null) {
            la0Var.k();
        }
    }

    public final void g(View view) {
        ArrayList arrayList = this.f52713j;
        arrayList.remove(view);
        int size = arrayList.size();
        ei.c3 c3Var = this.f52709e;
        if (size > 0 && !this.f52712i) {
            this.f52712i = true;
            c3Var.P();
        } else if (arrayList.size() <= 0 && this.f52712i) {
            this.f52712i = false;
            c3Var.R();
        }
        org.telegram.ui.Components.la0 la0Var = this.f52710f;
        if (la0Var != null) {
            la0Var.l();
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i3) {
        if (this.f52708c != i3) {
            this.f52708c = i3;
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
