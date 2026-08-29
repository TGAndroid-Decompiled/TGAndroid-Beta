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
public final class wn extends Drawable {
    public final boolean f44329a;
    public View f44330b;
    public int f44331c = 255;
    public final float d;
    public final lh.x2 f44332e;
    public final org.telegram.ui.Components.yb0 f44333f;
    public final TLRPC.WallPaper f44334g;
    public boolean h;
    public boolean f44335i;
    public final ArrayList f44336j;

    public wn(TLRPC.WallPaper wallPaper, boolean z10, boolean z11) {
        TLRPC.WallPaperSettings wallPaperSettings;
        String l10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        lh.x2 x2Var = new lh.x2(this, 2);
        this.f44332e = x2Var;
        this.f44336j = new ArrayList();
        x2Var.setInvalidateAll(true);
        boolean z12 = wallPaper.pattern;
        this.f44334g = wallPaper;
        this.f44329a = z10;
        if (z10 && ((wallPaper.document != null || wallPaper.uploadingImage != null) && !z12 && (wallPaperSettings2 = wallPaper.settings) != null)) {
            this.d = wallPaperSettings2.intensity / 100.0f;
        }
        if ((z12 || wallPaper.document == null) && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.second_background_color != 0 && wallPaperSettings.third_background_color != 0) {
            org.telegram.ui.Components.yb0 yb0Var = new org.telegram.ui.Components.yb0();
            this.f44333f = yb0Var;
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            yb0Var.n(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            int i10 = UserConfig.selectedAccount;
            long j10 = wallPaper.f22544id;
            tm tmVar = new tm(4, this, wallPaper);
            int[] iArr = org.telegram.ui.ActionBar.b4.h;
            boolean z13 = wallPaper.pattern;
            ChatThemeController.getInstance(i10).loadWallpaperBitmap(j10, z13 ? 1 : 0, new org.telegram.ui.ActionBar.z3(tmVar, wallPaper, z13 ? 1 : 0, i10, j10));
            return;
        }
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        if (z11) {
            l10 = "150_150_wallpaper";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / AndroidUtilities.density));
            sb2.append("_");
            l10 = a4.w.l((int) (max / AndroidUtilities.density), "_wallpaper", sb2);
        }
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n(l10);
        n10.append(wallPaper.f22544id);
        StringBuilder n11 = com.google.android.recaptcha.internal.a.n(n10.toString());
        n11.append(e(wallPaper.settings));
        String sb3 = n11.toString();
        Drawable b10 = b(wallPaper);
        String str = wallPaper.uploadingImage;
        if (str != null) {
            x2Var.setImage(ImageLocation.getForPath(str), sb3, b10, null, wallPaper, 1);
            return;
        }
        TLRPC.Document document = wallPaper.document;
        if (document != null) {
            x2Var.setImage(ImageLocation.getForDocument(document), sb3, b10, null, wallPaper, 1);
        } else {
            x2Var.setImageBitmap(b10);
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
        BitmapDrawable a2;
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
        int i10 = 0;
        if (wallPaper.document != null) {
            a2 = null;
            while (i10 < wallPaper.document.thumbs.size()) {
                if (wallPaper.document.thumbs.get(i10) instanceof TLRPC.TL_photoStrippedSize) {
                    a2 = new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(wallPaper.document.thumbs.get(i10).bytes, "b"));
                }
                i10++;
            }
        } else {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings != null && wallPaperSettings.intensity >= 0) {
                if (wallPaperSettings.second_background_color == 0) {
                    a2 = a(new ColorDrawable(i0.a.k(wallPaper.settings.background_color, 255)));
                } else if (wallPaperSettings.third_background_color == 0) {
                    a2 = a(new GradientDrawable(org.telegram.ui.Components.s9.d(wallPaper.settings.rotation), new int[]{i0.a.k(wallPaperSettings.background_color, 255), i0.a.k(wallPaper.settings.second_background_color, 255)}));
                } else {
                    int k9 = i0.a.k(wallPaperSettings.background_color, 255);
                    int k10 = i0.a.k(wallPaper.settings.second_background_color, 255);
                    int k11 = i0.a.k(wallPaper.settings.third_background_color, 255);
                    int i11 = wallPaper.settings.fourth_background_color;
                    if (i11 != 0) {
                        i10 = i0.a.k(i11, 255);
                    }
                    org.telegram.ui.Components.yb0 yb0Var = new org.telegram.ui.Components.yb0();
                    yb0Var.n(k9, k10, k11, i10);
                    a2 = new BitmapDrawable(yb0Var.f35026k);
                }
            } else {
                a2 = a(new ColorDrawable(-16777216));
            }
        }
        wallPaper.thumbDrawable = a2;
        return a2;
    }

    public static wn d(Drawable drawable, TLRPC.WallPaper wallPaper, boolean z10) {
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaperSettings wallPaperSettings2;
        if (drawable instanceof wn) {
            wn wnVar = (wn) drawable;
            boolean z11 = wnVar.f44329a;
            TLRPC.WallPaper wallPaper2 = wnVar.f44334g;
            String str = wallPaper.uploadingImage;
            if (str == null ? !(wallPaper.f22544id != wallPaper2.f22544id || !TextUtils.equals(e(wallPaper.settings), e(wallPaper2.settings)) || (wallPaper.document != null && !wallPaper.pattern && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.intensity > 0 && z11 != z10)) : !(!str.equals(wallPaper2.uploadingImage) || ((wallPaperSettings2 = wallPaper.settings) != null && wallPaper2.settings != null && wallPaperSettings2.intensity > 0 && z11 != z10))) {
                return wnVar;
            }
        }
        return new wn(wallPaper, z10, false);
    }

    public static String e(TLRPC.WallPaperSettings wallPaperSettings) {
        if (wallPaperSettings == null) {
            return "";
        }
        return String.valueOf(Objects.hash(Boolean.valueOf(wallPaperSettings.blur), Boolean.valueOf(wallPaperSettings.motion), Integer.valueOf(wallPaperSettings.intensity), Integer.valueOf(wallPaperSettings.background_color), Integer.valueOf(wallPaperSettings.second_background_color), Integer.valueOf(wallPaperSettings.third_background_color), Integer.valueOf(wallPaperSettings.fourth_background_color)));
    }

    public final Drawable c(boolean z10) {
        org.telegram.ui.Components.yb0 yb0Var = this.f44333f;
        if (yb0Var != null) {
            return yb0Var;
        }
        lh.x2 x2Var = this.f44332e;
        if (z10 && x2Var.getStaticThumb() != null) {
            return x2Var.getStaticThumb();
        }
        if (x2Var.getThumb() != null) {
            return x2Var.getThumb();
        }
        if (x2Var.getDrawable() != null) {
            return x2Var.getDrawable();
        }
        return x2Var.getStaticThumb();
    }

    @Override
    public final void draw(Canvas canvas) {
        org.telegram.ui.Components.yb0 yb0Var = this.f44333f;
        if (yb0Var != null) {
            yb0Var.setBounds(getBounds());
            yb0Var.setAlpha(this.f44331c);
            yb0Var.draw(canvas);
            return;
        }
        lh.x2 x2Var = this.f44332e;
        boolean hasImageLoaded = x2Var.hasImageLoaded();
        float f9 = this.d;
        boolean z10 = true;
        if (hasImageLoaded && x2Var.getCurrentAlpha() == 1.0f) {
            if (!this.h) {
                this.h = true;
                x2Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(-16777216, (int) (f9 * 255.0f)), PorterDuff.Mode.DARKEN));
            }
            z10 = false;
        }
        x2Var.setImageCoords(getBounds());
        x2Var.setAlpha(this.f44331c / 255.0f);
        x2Var.draw(canvas);
        if (z10 && f9 != 0.0f) {
            canvas.drawColor(i0.a.k(-16777216, (int) (f9 * 255.0f)));
        }
    }

    public final void f(View view) {
        ArrayList arrayList = this.f44336j;
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
        int size = arrayList.size();
        lh.x2 x2Var = this.f44332e;
        if (size > 0 && !this.f44335i) {
            this.f44335i = true;
            x2Var.onAttachedToWindow();
        } else if (arrayList.size() <= 0 && this.f44335i) {
            this.f44335i = false;
            x2Var.onDetachedFromWindow();
        }
        org.telegram.ui.Components.yb0 yb0Var = this.f44333f;
        if (yb0Var != null) {
            yb0Var.k();
        }
    }

    public final void g(View view) {
        ArrayList arrayList = this.f44336j;
        if (!arrayList.contains(view)) {
            arrayList.remove(view);
        }
        int size = arrayList.size();
        lh.x2 x2Var = this.f44332e;
        if (size > 0 && !this.f44335i) {
            this.f44335i = true;
            x2Var.onAttachedToWindow();
        } else if (arrayList.size() <= 0 && this.f44335i) {
            this.f44335i = false;
            x2Var.onDetachedFromWindow();
        }
        org.telegram.ui.Components.yb0 yb0Var = this.f44333f;
        if (yb0Var != null) {
            yb0Var.l();
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f44331c != i10) {
            this.f44331c = i10;
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
