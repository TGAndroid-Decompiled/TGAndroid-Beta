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
public final class vn extends Drawable {
    public final boolean f42792a;
    public View f42793b;
    public int f42794c = 255;
    public final float d;
    public final ci.f3 e;
    public final org.telegram.ui.Components.yc0 f42795f;
    public final TLRPC.WallPaper f42796g;
    public boolean h;
    public boolean f42797i;
    public final ArrayList f42798j;

    public vn(TLRPC.WallPaper wallPaper, boolean z10, boolean z11) {
        TLRPC.WallPaperSettings wallPaperSettings;
        String n10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        ci.f3 f3Var = new ci.f3(this, 3);
        this.e = f3Var;
        this.f42798j = new ArrayList();
        f3Var.setInvalidateAll(true);
        boolean z12 = wallPaper.pattern;
        this.f42796g = wallPaper;
        this.f42792a = z10;
        if (z10 && ((wallPaper.document != null || wallPaper.uploadingImage != null) && !z12 && (wallPaperSettings2 = wallPaper.settings) != null)) {
            this.d = wallPaperSettings2.intensity / 100.0f;
        }
        if ((z12 || wallPaper.document == null) && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.second_background_color != 0 && wallPaperSettings.third_background_color != 0) {
            org.telegram.ui.Components.yc0 yc0Var = new org.telegram.ui.Components.yc0();
            this.f42795f = yc0Var;
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            yc0Var.n(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            int i10 = UserConfig.selectedAccount;
            long j10 = wallPaper.f20495id;
            org.telegram.ui.ActionBar.m3 m3Var = new org.telegram.ui.ActionBar.m3(20, this, wallPaper);
            int[] iArr = org.telegram.ui.ActionBar.f4.h;
            boolean z13 = wallPaper.pattern;
            ChatThemeController.getInstance(i10).loadWallpaperBitmap(j10, z13 ? 1 : 0, new org.telegram.ui.ActionBar.d4(m3Var, wallPaper, z13 ? 1 : 0, i10, j10));
            return;
        }
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        if (z11) {
            n10 = "150_150_wallpaper";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / AndroidUtilities.density));
            sb2.append("_");
            n10 = a1.g.n((int) (max / AndroidUtilities.density), "_wallpaper", sb2);
        }
        StringBuilder u10 = a1.g.u(n10);
        u10.append(wallPaper.f20495id);
        StringBuilder u11 = a1.g.u(u10.toString());
        u11.append(e(wallPaper.settings));
        String sb3 = u11.toString();
        Drawable b10 = b(wallPaper);
        String str = wallPaper.uploadingImage;
        if (str != null) {
            f3Var.setImage(ImageLocation.getForPath(str), sb3, b10, null, wallPaper, 1);
            return;
        }
        TLRPC.Document document = wallPaper.document;
        if (document != null) {
            f3Var.setImage(ImageLocation.getForDocument(document), sb3, b10, null, wallPaper, 1);
        } else {
            f3Var.setImageBitmap(b10);
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
                    a2 = a(new ColorDrawable(i0.a.o(wallPaper.settings.background_color, 255)));
                } else if (wallPaperSettings.third_background_color == 0) {
                    a2 = a(new GradientDrawable(org.telegram.ui.Components.v9.d(wallPaper.settings.rotation), new int[]{i0.a.o(wallPaperSettings.background_color, 255), i0.a.o(wallPaper.settings.second_background_color, 255)}));
                } else {
                    int o10 = i0.a.o(wallPaperSettings.background_color, 255);
                    int o11 = i0.a.o(wallPaper.settings.second_background_color, 255);
                    int o12 = i0.a.o(wallPaper.settings.third_background_color, 255);
                    int i11 = wallPaper.settings.fourth_background_color;
                    if (i11 != 0) {
                        i10 = i0.a.o(i11, 255);
                    }
                    org.telegram.ui.Components.yc0 yc0Var = new org.telegram.ui.Components.yc0();
                    yc0Var.n(o10, o11, o12, i10);
                    a2 = new BitmapDrawable(yc0Var.f32887k);
                }
            } else {
                a2 = a(new ColorDrawable(-16777216));
            }
        }
        wallPaper.thumbDrawable = a2;
        return a2;
    }

    public static vn d(Drawable drawable, TLRPC.WallPaper wallPaper, boolean z10) {
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaperSettings wallPaperSettings2;
        if (drawable instanceof vn) {
            vn vnVar = (vn) drawable;
            boolean z11 = vnVar.f42792a;
            TLRPC.WallPaper wallPaper2 = vnVar.f42796g;
            String str = wallPaper.uploadingImage;
            if (str == null ? !(wallPaper.f20495id != wallPaper2.f20495id || !TextUtils.equals(e(wallPaper.settings), e(wallPaper2.settings)) || (wallPaper.document != null && !wallPaper.pattern && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.intensity > 0 && z11 != z10)) : !(!str.equals(wallPaper2.uploadingImage) || ((wallPaperSettings2 = wallPaper.settings) != null && wallPaper2.settings != null && wallPaperSettings2.intensity > 0 && z11 != z10))) {
                return vnVar;
            }
        }
        return new vn(wallPaper, z10, false);
    }

    public static String e(TLRPC.WallPaperSettings wallPaperSettings) {
        if (wallPaperSettings == null) {
            return "";
        }
        return String.valueOf(Objects.hash(Boolean.valueOf(wallPaperSettings.blur), Boolean.valueOf(wallPaperSettings.motion), Integer.valueOf(wallPaperSettings.intensity), Integer.valueOf(wallPaperSettings.background_color), Integer.valueOf(wallPaperSettings.second_background_color), Integer.valueOf(wallPaperSettings.third_background_color), Integer.valueOf(wallPaperSettings.fourth_background_color)));
    }

    public final Drawable c(boolean z10) {
        org.telegram.ui.Components.yc0 yc0Var = this.f42795f;
        if (yc0Var != null) {
            return yc0Var;
        }
        ci.f3 f3Var = this.e;
        if (z10 && f3Var.getStaticThumb() != null) {
            return f3Var.getStaticThumb();
        }
        if (f3Var.getThumb() != null) {
            return f3Var.getThumb();
        }
        if (f3Var.getDrawable() != null) {
            return f3Var.getDrawable();
        }
        return f3Var.getStaticThumb();
    }

    @Override
    public final void draw(Canvas canvas) {
        org.telegram.ui.Components.yc0 yc0Var = this.f42795f;
        if (yc0Var != null) {
            yc0Var.setBounds(getBounds());
            yc0Var.setAlpha(this.f42794c);
            yc0Var.draw(canvas);
            return;
        }
        ci.f3 f3Var = this.e;
        boolean hasImageLoaded = f3Var.hasImageLoaded();
        float f7 = this.d;
        boolean z10 = true;
        if (hasImageLoaded && f3Var.getCurrentAlpha() == 1.0f) {
            if (!this.h) {
                this.h = true;
                f3Var.setColorFilter(new PorterDuffColorFilter(i0.a.o(-16777216, (int) (f7 * 255.0f)), PorterDuff.Mode.DARKEN));
            }
            z10 = false;
        }
        f3Var.setImageCoords(getBounds());
        f3Var.setAlpha(this.f42794c / 255.0f);
        f3Var.draw(canvas);
        if (z10 && f7 != 0.0f) {
            canvas.drawColor(i0.a.o(-16777216, (int) (f7 * 255.0f)));
        }
    }

    public final void f(View view) {
        ArrayList arrayList = this.f42798j;
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
        int size = arrayList.size();
        ci.f3 f3Var = this.e;
        if (size > 0 && !this.f42797i) {
            this.f42797i = true;
            f3Var.onAttachedToWindow();
        } else if (arrayList.size() <= 0 && this.f42797i) {
            this.f42797i = false;
            f3Var.onDetachedFromWindow();
        }
        org.telegram.ui.Components.yc0 yc0Var = this.f42795f;
        if (yc0Var != null) {
            yc0Var.k();
        }
    }

    public final void g(View view) {
        ArrayList arrayList = this.f42798j;
        if (!arrayList.contains(view)) {
            arrayList.remove(view);
        }
        int size = arrayList.size();
        ci.f3 f3Var = this.e;
        if (size > 0 && !this.f42797i) {
            this.f42797i = true;
            f3Var.onAttachedToWindow();
        } else if (arrayList.size() <= 0 && this.f42797i) {
            this.f42797i = false;
            f3Var.onDetachedFromWindow();
        }
        org.telegram.ui.Components.yc0 yc0Var = this.f42795f;
        if (yc0Var != null) {
            yc0Var.l();
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f42794c != i10) {
            this.f42794c = i10;
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
