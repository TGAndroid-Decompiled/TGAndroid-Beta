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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class un extends Drawable {

    public final boolean f43254a;

    public View f43255b;

    public int f43256c = 255;
    public final float d;

    public final jh.y2 f43257e;

    public final org.telegram.ui.Components.nb0 f43258f;

    public final TLRPC.WallPaper f43259g;
    public boolean h;

    public boolean f43260i;

    public final ArrayList f43261j;

    public un(TLRPC.WallPaper wallPaper, boolean z10, boolean z11) {
        TLRPC.WallPaperSettings wallPaperSettings;
        String strK;
        TLRPC.WallPaperSettings wallPaperSettings2;
        jh.y2 y2Var = new jh.y2(this, 2);
        this.f43257e = y2Var;
        this.f43261j = new ArrayList();
        y2Var.setInvalidateAll(true);
        boolean z12 = wallPaper.pattern;
        this.f43259g = wallPaper;
        this.f43254a = z10;
        if (z10 && ((wallPaper.document != null || wallPaper.uploadingImage != null) && !z12 && (wallPaperSettings2 = wallPaper.settings) != null)) {
            this.d = wallPaperSettings2.intensity / 100.0f;
        }
        if ((z12 || wallPaper.document == null) && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.second_background_color != 0 && wallPaperSettings.third_background_color != 0) {
            org.telegram.ui.Components.nb0 nb0Var = new org.telegram.ui.Components.nb0();
            this.f43258f = nb0Var;
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            nb0Var.n(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            int i10 = UserConfig.selectedAccount;
            long j10 = wallPaper.f22532id;
            df dfVar = new df(11, this, wallPaper);
            int[] iArr = org.telegram.ui.ActionBar.b4.h;
            boolean z13 = wallPaper.pattern;
            ChatThemeController.getInstance(i10).loadWallpaperBitmap(j10, z13 ? 1 : 0, new org.telegram.ui.ActionBar.z3(dfVar, wallPaper, z13 ? 1 : 0, i10, j10));
            return;
        }
        Point point = AndroidUtilities.displaySize;
        int iMin = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int iMax = Math.max(point2.x, point2.y);
        if (z11) {
            strK = "150_150_wallpaper";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (iMin / AndroidUtilities.density));
            sb2.append("_");
            strK = a9.p.k((int) (iMax / AndroidUtilities.density), "_wallpaper", sb2);
        }
        StringBuilder sbO = com.google.android.recaptcha.internal.a.o(strK);
        sbO.append(wallPaper.f22532id);
        StringBuilder sbO2 = com.google.android.recaptcha.internal.a.o(sbO.toString());
        sbO2.append(e(wallPaper.settings));
        String string = sbO2.toString();
        Drawable drawableB = b(wallPaper);
        String str = wallPaper.uploadingImage;
        if (str != null) {
            y2Var.setImage(ImageLocation.getForPath(str), string, drawableB, null, wallPaper, 1);
            return;
        }
        TLRPC.Document document = wallPaper.document;
        if (document != null) {
            y2Var.setImage(ImageLocation.getForDocument(document), string, drawableB, null, wallPaper, 1);
        } else {
            y2Var.setImageBitmap(drawableB);
        }
    }

    public static BitmapDrawable a(Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(20, 20, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, 20, 20);
        drawable.draw(canvas);
        return new BitmapDrawable(bitmapCreateBitmap);
    }

    public static Drawable b(TLRPC.WallPaper wallPaper) {
        BitmapDrawable bitmapDrawableA;
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
        if (wallPaper.document != null) {
            bitmapDrawableA = null;
            for (int iK = 0; iK < wallPaper.document.thumbs.size(); iK++) {
                if (wallPaper.document.thumbs.get(iK) instanceof TLRPC.TL_photoStrippedSize) {
                    bitmapDrawableA = new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(wallPaper.document.thumbs.get(iK).bytes, "b"));
                }
            }
        } else {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings == null || wallPaperSettings.intensity < 0) {
                bitmapDrawableA = a(new ColorDrawable(-16777216));
            } else if (wallPaperSettings.second_background_color == 0) {
                bitmapDrawableA = a(new ColorDrawable(i0.b.k(wallPaper.settings.background_color, 255)));
            } else if (wallPaperSettings.third_background_color == 0) {
                bitmapDrawableA = a(new GradientDrawable(org.telegram.ui.Components.m9.d(wallPaper.settings.rotation), new int[]{i0.b.k(wallPaperSettings.background_color, 255), i0.b.k(wallPaper.settings.second_background_color, 255)}));
            } else {
                int iK2 = i0.b.k(wallPaperSettings.background_color, 255);
                int iK3 = i0.b.k(wallPaper.settings.second_background_color, 255);
                int iK4 = i0.b.k(wallPaper.settings.third_background_color, 255);
                int i10 = wallPaper.settings.fourth_background_color;
                iK = i10 != 0 ? i0.b.k(i10, 255) : 0;
                org.telegram.ui.Components.nb0 nb0Var = new org.telegram.ui.Components.nb0();
                nb0Var.n(iK2, iK3, iK4, iK);
                bitmapDrawableA = new BitmapDrawable(nb0Var.f30929k);
            }
        }
        wallPaper.thumbDrawable = bitmapDrawableA;
        return bitmapDrawableA;
    }

    public static un d(Drawable drawable, TLRPC.WallPaper wallPaper, boolean z10) {
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaperSettings wallPaperSettings2;
        if (drawable instanceof un) {
            un unVar = (un) drawable;
            boolean z11 = unVar.f43254a;
            TLRPC.WallPaper wallPaper2 = unVar.f43259g;
            String str = wallPaper.uploadingImage;
            if (str == null ? !(wallPaper.f22532id != wallPaper2.f22532id || !TextUtils.equals(e(wallPaper.settings), e(wallPaper2.settings)) || (wallPaper.document != null && !wallPaper.pattern && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.intensity > 0 && z11 != z10)) : !(!str.equals(wallPaper2.uploadingImage) || ((wallPaperSettings2 = wallPaper.settings) != null && wallPaper2.settings != null && wallPaperSettings2.intensity > 0 && z11 != z10))) {
                return unVar;
            }
        }
        return new un(wallPaper, z10, false);
    }

    public static String e(TLRPC.WallPaperSettings wallPaperSettings) {
        return wallPaperSettings == null ? "" : String.valueOf(Objects.hash(Boolean.valueOf(wallPaperSettings.blur), Boolean.valueOf(wallPaperSettings.motion), Integer.valueOf(wallPaperSettings.intensity), Integer.valueOf(wallPaperSettings.background_color), Integer.valueOf(wallPaperSettings.second_background_color), Integer.valueOf(wallPaperSettings.third_background_color), Integer.valueOf(wallPaperSettings.fourth_background_color)));
    }

    public final Drawable c(boolean z10) {
        org.telegram.ui.Components.nb0 nb0Var = this.f43258f;
        if (nb0Var != null) {
            return nb0Var;
        }
        jh.y2 y2Var = this.f43257e;
        if (z10 && y2Var.getStaticThumb() != null) {
            return y2Var.getStaticThumb();
        }
        if (y2Var.getThumb() != null) {
            return y2Var.getThumb();
        }
        return y2Var.getDrawable() != null ? y2Var.getDrawable() : y2Var.getStaticThumb();
    }

    @Override
    public final void draw(Canvas canvas) {
        org.telegram.ui.Components.nb0 nb0Var = this.f43258f;
        if (nb0Var != null) {
            nb0Var.setBounds(getBounds());
            nb0Var.setAlpha(this.f43256c);
            nb0Var.draw(canvas);
            return;
        }
        jh.y2 y2Var = this.f43257e;
        boolean zHasImageLoaded = y2Var.hasImageLoaded();
        float f10 = this.d;
        boolean z10 = true;
        if (zHasImageLoaded && y2Var.getCurrentAlpha() == 1.0f) {
            if (!this.h) {
                this.h = true;
                y2Var.setColorFilter(new PorterDuffColorFilter(i0.b.k(-16777216, (int) (f10 * 255.0f)), PorterDuff.Mode.DARKEN));
            }
            z10 = false;
        }
        y2Var.setImageCoords(getBounds());
        y2Var.setAlpha(this.f43256c / 255.0f);
        y2Var.draw(canvas);
        if (!z10 || f10 == 0.0f) {
            return;
        }
        canvas.drawColor(i0.b.k(-16777216, (int) (f10 * 255.0f)));
    }

    public final void f(View view) {
        ArrayList arrayList = this.f43261j;
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
        int size = arrayList.size();
        jh.y2 y2Var = this.f43257e;
        if (size > 0 && !this.f43260i) {
            this.f43260i = true;
            y2Var.onAttachedToWindow();
        } else if (arrayList.size() <= 0 && this.f43260i) {
            this.f43260i = false;
            y2Var.onDetachedFromWindow();
        }
        org.telegram.ui.Components.nb0 nb0Var = this.f43258f;
        if (nb0Var != null) {
            nb0Var.k();
        }
    }

    public final void g(View view) {
        ArrayList arrayList = this.f43261j;
        if (!arrayList.contains(view)) {
            arrayList.remove(view);
        }
        int size = arrayList.size();
        jh.y2 y2Var = this.f43257e;
        if (size > 0 && !this.f43260i) {
            this.f43260i = true;
            y2Var.onAttachedToWindow();
        } else if (arrayList.size() <= 0 && this.f43260i) {
            this.f43260i = false;
            y2Var.onDetachedFromWindow();
        }
        org.telegram.ui.Components.nb0 nb0Var = this.f43258f;
        if (nb0Var != null) {
            nb0Var.l();
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f43256c != i10) {
            this.f43256c = i10;
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
