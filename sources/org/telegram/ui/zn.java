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
public final class zn extends Drawable {
    public final boolean f40541a;
    public View f40542b;
    public int f40543c = 255;
    public final float d;
    public final ai.l4 e;
    public final org.telegram.ui.Components.mc0 f40544f;
    public final TLRPC.WallPaper f40545g;
    public boolean h;
    public boolean f40546i;
    public final ArrayList f40547j;

    public zn(TLRPC.WallPaper wallPaper, boolean z10, boolean z11) {
        TLRPC.WallPaperSettings wallPaperSettings;
        String o9;
        TLRPC.WallPaperSettings wallPaperSettings2;
        ai.l4 l4Var = new ai.l4(this, 3);
        this.e = l4Var;
        this.f40547j = new ArrayList();
        l4Var.setInvalidateAll(true);
        boolean z12 = wallPaper.pattern;
        this.f40545g = wallPaper;
        this.f40541a = z10;
        if (z10 && ((wallPaper.document != null || wallPaper.uploadingImage != null) && !z12 && (wallPaperSettings2 = wallPaper.settings) != null)) {
            this.d = wallPaperSettings2.intensity / 100.0f;
        }
        if ((z12 || wallPaper.document == null) && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.second_background_color != 0 && wallPaperSettings.third_background_color != 0) {
            org.telegram.ui.Components.mc0 mc0Var = new org.telegram.ui.Components.mc0();
            this.f40544f = mc0Var;
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            mc0Var.n(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            int i10 = UserConfig.selectedAccount;
            long j3 = wallPaper.f18487id;
            oc ocVar = new oc(14, this, wallPaper);
            int[] iArr = org.telegram.ui.ActionBar.b4.h;
            boolean z13 = wallPaper.pattern;
            ChatThemeController.getInstance(i10).loadWallpaperBitmap(j3, z13 ? 1 : 0, new org.telegram.ui.ActionBar.z3(ocVar, wallPaper, z13 ? 1 : 0, i10, j3));
            return;
        }
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        if (z11) {
            o9 = "150_150_wallpaper";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / AndroidUtilities.density));
            sb2.append("_");
            o9 = a4.a.o((int) (max / AndroidUtilities.density), "_wallpaper", sb2);
        }
        StringBuilder v = a4.a.v(o9);
        v.append(wallPaper.f18487id);
        StringBuilder v9 = a4.a.v(v.toString());
        v9.append(e(wallPaper.settings));
        String sb3 = v9.toString();
        Drawable b10 = b(wallPaper);
        String str = wallPaper.uploadingImage;
        if (str != null) {
            l4Var.setImage(ImageLocation.getForPath(str), sb3, b10, null, wallPaper, 1);
            return;
        }
        TLRPC.Document document = wallPaper.document;
        if (document != null) {
            l4Var.setImage(ImageLocation.getForDocument(document), sb3, b10, null, wallPaper, 1);
        } else {
            l4Var.setImageBitmap(b10);
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
                    a2 = a(new GradientDrawable(org.telegram.ui.Components.v9.d(wallPaper.settings.rotation), new int[]{i0.a.k(wallPaperSettings.background_color, 255), i0.a.k(wallPaper.settings.second_background_color, 255)}));
                } else {
                    int k10 = i0.a.k(wallPaperSettings.background_color, 255);
                    int k11 = i0.a.k(wallPaper.settings.second_background_color, 255);
                    int k12 = i0.a.k(wallPaper.settings.third_background_color, 255);
                    int i11 = wallPaper.settings.fourth_background_color;
                    if (i11 != 0) {
                        i10 = i0.a.k(i11, 255);
                    }
                    org.telegram.ui.Components.mc0 mc0Var = new org.telegram.ui.Components.mc0();
                    mc0Var.n(k10, k11, k12, i10);
                    a2 = new BitmapDrawable(mc0Var.f26442k);
                }
            } else {
                a2 = a(new ColorDrawable(-16777216));
            }
        }
        wallPaper.thumbDrawable = a2;
        return a2;
    }

    public static zn d(Drawable drawable, TLRPC.WallPaper wallPaper, boolean z10) {
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaperSettings wallPaperSettings2;
        if (drawable instanceof zn) {
            zn znVar = (zn) drawable;
            boolean z11 = znVar.f40541a;
            TLRPC.WallPaper wallPaper2 = znVar.f40545g;
            String str = wallPaper.uploadingImage;
            if (str == null ? !(wallPaper.f18487id != wallPaper2.f18487id || !TextUtils.equals(e(wallPaper.settings), e(wallPaper2.settings)) || (wallPaper.document != null && !wallPaper.pattern && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.intensity > 0 && z11 != z10)) : !(!str.equals(wallPaper2.uploadingImage) || ((wallPaperSettings2 = wallPaper.settings) != null && wallPaper2.settings != null && wallPaperSettings2.intensity > 0 && z11 != z10))) {
                return znVar;
            }
        }
        return new zn(wallPaper, z10, false);
    }

    public static String e(TLRPC.WallPaperSettings wallPaperSettings) {
        if (wallPaperSettings == null) {
            return "";
        }
        return String.valueOf(Objects.hash(Boolean.valueOf(wallPaperSettings.blur), Boolean.valueOf(wallPaperSettings.motion), Integer.valueOf(wallPaperSettings.intensity), Integer.valueOf(wallPaperSettings.background_color), Integer.valueOf(wallPaperSettings.second_background_color), Integer.valueOf(wallPaperSettings.third_background_color), Integer.valueOf(wallPaperSettings.fourth_background_color)));
    }

    public final Drawable c(boolean z10) {
        org.telegram.ui.Components.mc0 mc0Var = this.f40544f;
        if (mc0Var != null) {
            return mc0Var;
        }
        ai.l4 l4Var = this.e;
        if (z10 && l4Var.getStaticThumb() != null) {
            return l4Var.getStaticThumb();
        }
        if (l4Var.getThumb() != null) {
            return l4Var.getThumb();
        }
        if (l4Var.getDrawable() != null) {
            return l4Var.getDrawable();
        }
        return l4Var.getStaticThumb();
    }

    @Override
    public final void draw(Canvas canvas) {
        org.telegram.ui.Components.mc0 mc0Var = this.f40544f;
        if (mc0Var != null) {
            mc0Var.setBounds(getBounds());
            mc0Var.setAlpha(this.f40543c);
            mc0Var.draw(canvas);
            return;
        }
        ai.l4 l4Var = this.e;
        boolean hasImageLoaded = l4Var.hasImageLoaded();
        float f7 = this.d;
        boolean z10 = true;
        if (hasImageLoaded && l4Var.getCurrentAlpha() == 1.0f) {
            if (!this.h) {
                this.h = true;
                l4Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(-16777216, (int) (f7 * 255.0f)), PorterDuff.Mode.DARKEN));
            }
            z10 = false;
        }
        l4Var.setImageCoords(getBounds());
        l4Var.setAlpha(this.f40543c / 255.0f);
        l4Var.draw(canvas);
        if (z10 && f7 != 0.0f) {
            canvas.drawColor(i0.a.k(-16777216, (int) (f7 * 255.0f)));
        }
    }

    public final void f(View view) {
        ArrayList arrayList = this.f40547j;
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
        int size = arrayList.size();
        ai.l4 l4Var = this.e;
        if (size > 0 && !this.f40546i) {
            this.f40546i = true;
            l4Var.onAttachedToWindow();
        } else if (arrayList.size() <= 0 && this.f40546i) {
            this.f40546i = false;
            l4Var.onDetachedFromWindow();
        }
        org.telegram.ui.Components.mc0 mc0Var = this.f40544f;
        if (mc0Var != null) {
            mc0Var.k();
        }
    }

    public final void g(View view) {
        ArrayList arrayList = this.f40547j;
        if (!arrayList.contains(view)) {
            arrayList.remove(view);
        }
        int size = arrayList.size();
        ai.l4 l4Var = this.e;
        if (size > 0 && !this.f40546i) {
            this.f40546i = true;
            l4Var.onAttachedToWindow();
        } else if (arrayList.size() <= 0 && this.f40546i) {
            this.f40546i = false;
            l4Var.onDetachedFromWindow();
        }
        org.telegram.ui.Components.mc0 mc0Var = this.f40544f;
        if (mc0Var != null) {
            mc0Var.l();
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f40543c != i10) {
            this.f40543c = i10;
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
