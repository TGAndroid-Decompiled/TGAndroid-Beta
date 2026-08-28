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
public final class tn extends Drawable {
    public final boolean f43034a;
    public View f43035b;
    public int f43036c = 255;
    public final float d;
    public final ih.z2 f43037e;
    public final org.telegram.ui.Components.jb0 f43038f;
    public final TLRPC.WallPaper f43039g;
    public boolean h;
    public boolean f43040i;
    public final ArrayList f43041j;

    public tn(TLRPC.WallPaper wallPaper, boolean z10, boolean z11) {
        TLRPC.WallPaperSettings wallPaperSettings;
        String l10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        ih.z2 z2Var = new ih.z2(this, 2);
        this.f43037e = z2Var;
        this.f43041j = new ArrayList();
        z2Var.setInvalidateAll(true);
        boolean z12 = wallPaper.pattern;
        this.f43039g = wallPaper;
        this.f43034a = z10;
        if (z10 && ((wallPaper.document != null || wallPaper.uploadingImage != null) && !z12 && (wallPaperSettings2 = wallPaper.settings) != null)) {
            this.d = wallPaperSettings2.intensity / 100.0f;
        }
        if ((z12 || wallPaper.document == null) && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.second_background_color != 0 && wallPaperSettings.third_background_color != 0) {
            org.telegram.ui.Components.jb0 jb0Var = new org.telegram.ui.Components.jb0();
            this.f43038f = jb0Var;
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            jb0Var.n(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            int i9 = UserConfig.selectedAccount;
            long j10 = wallPaper.f22532id;
            df dfVar = new df(11, this, wallPaper);
            int[] iArr = org.telegram.ui.ActionBar.b4.h;
            boolean z13 = wallPaper.pattern;
            ChatThemeController.getInstance(i9).loadWallpaperBitmap(j10, z13 ? 1 : 0, new org.telegram.ui.ActionBar.z3(dfVar, wallPaper, z13 ? 1 : 0, i9, j10));
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
            l10 = aa.d.l((int) (max / AndroidUtilities.density), "_wallpaper", sb2);
        }
        StringBuilder n10 = e2.c.n(l10);
        n10.append(wallPaper.f22532id);
        StringBuilder n11 = e2.c.n(n10.toString());
        n11.append(e(wallPaper.settings));
        String sb3 = n11.toString();
        Drawable b10 = b(wallPaper);
        String str = wallPaper.uploadingImage;
        if (str != null) {
            z2Var.setImage(ImageLocation.getForPath(str), sb3, b10, null, wallPaper, 1);
            return;
        }
        TLRPC.Document document = wallPaper.document;
        if (document != null) {
            z2Var.setImage(ImageLocation.getForDocument(document), sb3, b10, null, wallPaper, 1);
        } else {
            z2Var.setImageBitmap(b10);
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
        int i9 = 0;
        if (wallPaper.document != null) {
            a2 = null;
            while (i9 < wallPaper.document.thumbs.size()) {
                if (wallPaper.document.thumbs.get(i9) instanceof TLRPC.TL_photoStrippedSize) {
                    a2 = new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(wallPaper.document.thumbs.get(i9).bytes, "b"));
                }
                i9++;
            }
        } else {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings != null && wallPaperSettings.intensity >= 0) {
                if (wallPaperSettings.second_background_color == 0) {
                    a2 = a(new ColorDrawable(i0.a.k(wallPaper.settings.background_color, 255)));
                } else if (wallPaperSettings.third_background_color == 0) {
                    a2 = a(new GradientDrawable(org.telegram.ui.Components.n9.d(wallPaper.settings.rotation), new int[]{i0.a.k(wallPaperSettings.background_color, 255), i0.a.k(wallPaper.settings.second_background_color, 255)}));
                } else {
                    int k10 = i0.a.k(wallPaperSettings.background_color, 255);
                    int k11 = i0.a.k(wallPaper.settings.second_background_color, 255);
                    int k12 = i0.a.k(wallPaper.settings.third_background_color, 255);
                    int i10 = wallPaper.settings.fourth_background_color;
                    if (i10 != 0) {
                        i9 = i0.a.k(i10, 255);
                    }
                    org.telegram.ui.Components.jb0 jb0Var = new org.telegram.ui.Components.jb0();
                    jb0Var.n(k10, k11, k12, i9);
                    a2 = new BitmapDrawable(jb0Var.f29698k);
                }
            } else {
                a2 = a(new ColorDrawable(-16777216));
            }
        }
        wallPaper.thumbDrawable = a2;
        return a2;
    }

    public static tn d(Drawable drawable, TLRPC.WallPaper wallPaper, boolean z10) {
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaperSettings wallPaperSettings2;
        if (drawable instanceof tn) {
            tn tnVar = (tn) drawable;
            boolean z11 = tnVar.f43034a;
            TLRPC.WallPaper wallPaper2 = tnVar.f43039g;
            String str = wallPaper.uploadingImage;
            if (str == null ? !(wallPaper.f22532id != wallPaper2.f22532id || !TextUtils.equals(e(wallPaper.settings), e(wallPaper2.settings)) || (wallPaper.document != null && !wallPaper.pattern && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.intensity > 0 && z11 != z10)) : !(!str.equals(wallPaper2.uploadingImage) || ((wallPaperSettings2 = wallPaper.settings) != null && wallPaper2.settings != null && wallPaperSettings2.intensity > 0 && z11 != z10))) {
                return tnVar;
            }
        }
        return new tn(wallPaper, z10, false);
    }

    public static String e(TLRPC.WallPaperSettings wallPaperSettings) {
        if (wallPaperSettings == null) {
            return "";
        }
        return String.valueOf(Objects.hash(Boolean.valueOf(wallPaperSettings.blur), Boolean.valueOf(wallPaperSettings.motion), Integer.valueOf(wallPaperSettings.intensity), Integer.valueOf(wallPaperSettings.background_color), Integer.valueOf(wallPaperSettings.second_background_color), Integer.valueOf(wallPaperSettings.third_background_color), Integer.valueOf(wallPaperSettings.fourth_background_color)));
    }

    public final Drawable c(boolean z10) {
        org.telegram.ui.Components.jb0 jb0Var = this.f43038f;
        if (jb0Var != null) {
            return jb0Var;
        }
        ih.z2 z2Var = this.f43037e;
        if (z10 && z2Var.getStaticThumb() != null) {
            return z2Var.getStaticThumb();
        }
        if (z2Var.getThumb() != null) {
            return z2Var.getThumb();
        }
        if (z2Var.getDrawable() != null) {
            return z2Var.getDrawable();
        }
        return z2Var.getStaticThumb();
    }

    @Override
    public final void draw(Canvas canvas) {
        org.telegram.ui.Components.jb0 jb0Var = this.f43038f;
        if (jb0Var != null) {
            jb0Var.setBounds(getBounds());
            jb0Var.setAlpha(this.f43036c);
            jb0Var.draw(canvas);
            return;
        }
        ih.z2 z2Var = this.f43037e;
        boolean hasImageLoaded = z2Var.hasImageLoaded();
        float f10 = this.d;
        boolean z10 = true;
        if (hasImageLoaded && z2Var.getCurrentAlpha() == 1.0f) {
            if (!this.h) {
                this.h = true;
                z2Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(-16777216, (int) (f10 * 255.0f)), PorterDuff.Mode.DARKEN));
            }
            z10 = false;
        }
        z2Var.setImageCoords(getBounds());
        z2Var.setAlpha(this.f43036c / 255.0f);
        z2Var.draw(canvas);
        if (z10 && f10 != 0.0f) {
            canvas.drawColor(i0.a.k(-16777216, (int) (f10 * 255.0f)));
        }
    }

    public final void f(View view) {
        ArrayList arrayList = this.f43041j;
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
        int size = arrayList.size();
        ih.z2 z2Var = this.f43037e;
        if (size > 0 && !this.f43040i) {
            this.f43040i = true;
            z2Var.onAttachedToWindow();
        } else if (arrayList.size() <= 0 && this.f43040i) {
            this.f43040i = false;
            z2Var.onDetachedFromWindow();
        }
        org.telegram.ui.Components.jb0 jb0Var = this.f43038f;
        if (jb0Var != null) {
            jb0Var.k();
        }
    }

    public final void g(View view) {
        ArrayList arrayList = this.f43041j;
        if (!arrayList.contains(view)) {
            arrayList.remove(view);
        }
        int size = arrayList.size();
        ih.z2 z2Var = this.f43037e;
        if (size > 0 && !this.f43040i) {
            this.f43040i = true;
            z2Var.onAttachedToWindow();
        } else if (arrayList.size() <= 0 && this.f43040i) {
            this.f43040i = false;
            z2Var.onDetachedFromWindow();
        }
        org.telegram.ui.Components.jb0 jb0Var = this.f43038f;
        if (jb0Var != null) {
            jb0Var.l();
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i9) {
        if (this.f43036c != i9) {
            this.f43036c = i9;
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
