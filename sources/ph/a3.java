package ph;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.cl0;
import org.telegram.ui.h51;
import org.telegram.ui.ib0;
import org.telegram.ui.s61;
public abstract class a3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final MediaController.AlbumEntry f41280g0 = new MediaController.AlbumEntry(-1, null, null);
    public final Drawable B;
    public final r2 C;
    public final org.telegram.ui.ActionBar.w0 D;
    public final ImageView E;
    public final LinearLayout F;
    public final d G;
    public boolean H;
    public final boolean I;
    public final boolean J;
    public int K;
    public final float L;
    public final boolean M;
    public boolean N;
    public int O;
    public final org.telegram.ui.Components.z5 P;
    public boolean Q;
    public boolean R;
    public Runnable S;
    public Utilities.Callback2 T;
    public Utilities.Callback3 U;
    public final ArrayList V;
    public boolean W;
    public final int f41281a;
    public boolean f41282a0;
    public final org.telegram.ui.ActionBar.f6 f41283b;
    public MediaController.AlbumEntry f41284b0;
    public final Paint f41285c;
    public ArrayList f41286c0;
    public final l2 d;
    public ArrayList f41287d0;
    public final m2 e;
    public final ArrayList f41288e0;
    public final v2 f41289f;
    public h51 f41290f0;
    public final FrameLayout h;
    public final rl0 f41291n;
    public final s2 f41292r;
    public final zw0 f41293s;
    public final i3 v;
    public boolean f41294w;
    public final org.telegram.ui.ActionBar.k f41295x;
    public final TextView f41296y;

    public a3(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, MediaController.AlbumEntry albumEntry, boolean z4, float f10, boolean z10, boolean z11) {
        super(context);
        Paint paint = new Paint(1);
        this.f41285c = paint;
        this.K = -2;
        this.P = new org.telegram.ui.Components.z5(this, 0L, 350L, mr.h);
        this.R = true;
        ArrayList arrayList = new ArrayList();
        this.V = arrayList;
        this.f41288e0 = new ArrayList();
        this.L = f10;
        this.f41281a = i10;
        this.f41283b = f6Var;
        this.I = z4;
        this.J = z10;
        this.M = z11;
        paint.setColor(-14737633);
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(-0.4f), 134217728);
        l2 l2Var = new l2(this, context, f6Var);
        this.d = l2Var;
        l2Var.setItemSelectorColorProvider(new cl0(16));
        v2 v2Var = new v2(this);
        this.f41289f = v2Var;
        l2Var.setAdapter(v2Var);
        m2 m2Var = new m2(this);
        this.e = m2Var;
        l2Var.setLayoutManager(m2Var);
        l2Var.setFastScrollEnabled(1);
        l2Var.setFastScrollVisible(true);
        l2Var.getFastScroll().setAlpha(0.0f);
        m2Var.O = new n2(this);
        l2Var.i(new Object());
        l2Var.setClipToPadding(false);
        addView(l2Var, k7.b6.e(-1, -1, 119));
        l2Var.setOnItemClickListener(new hl0(this) {
            public final a3 f41601b;

            {
                this.f41601b = this;
            }

            @Override
            public final void d(int i11, View view) {
                Utilities.Callback2 callback2;
                switch (r2) {
                    case 0:
                        a3 a3Var = this.f41601b;
                        ArrayList arrayList2 = a3Var.V;
                        ArrayList arrayList3 = a3Var.f41288e0;
                        if (i11 >= 2 && a3Var.T != null && (view instanceof x2)) {
                            x2 x2Var = (x2) view;
                            int i12 = i11 - 2;
                            Bitmap bitmap = null;
                            if (a3Var.W) {
                                if (i12 == 0) {
                                    a3Var.e(a3.f41280g0, true);
                                    return;
                                }
                                i12 = i11 - 3;
                            } else if (a3Var.f41282a0) {
                                if (i12 >= 0 && i12 < arrayList2.size()) {
                                    t6 t6Var = (t6) arrayList2.get(i12);
                                    Utilities.Callback2 callback22 = a3Var.T;
                                    if (t6Var.K) {
                                        bitmap = a3.d(x2Var);
                                    }
                                    callback22.run(t6Var, bitmap);
                                    return;
                                }
                                i12 -= arrayList2.size();
                            }
                            if (i12 >= 0 && i12 < a3Var.f41286c0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) a3Var.f41286c0.get(i12);
                                if (arrayList3.isEmpty() && !a3Var.N) {
                                    Utilities.Callback2 callback23 = a3Var.T;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        bitmap = a3.d(x2Var);
                                    }
                                    callback23.run(photoEntry, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(photoEntry)) {
                                    arrayList3.remove(photoEntry);
                                } else if (arrayList3.size() + 1 > a3Var.O) {
                                    int i13 = -a3Var.K;
                                    a3Var.K = i13;
                                    AndroidUtilities.shakeViewSpring(x2Var, i13);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    return;
                                } else {
                                    arrayList3.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(a3Var.d);
                                a3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        a3 a3Var2 = this.f41601b;
                        s2 s2Var = a3Var2.f41292r;
                        org.telegram.ui.ActionBar.w0 w0Var = a3Var2.D;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchContainer());
                        }
                        if (i11 >= 0 && i11 < s2Var.f42686c.size() && (callback2 = a3Var2.T) != null) {
                            callback2.run(s2Var.f42686c.get(i11), null);
                            return;
                        }
                        return;
                }
            }
        });
        l2Var.setOnItemLongClickListener(new lh.m5(this, 26));
        l2Var.setOnScrollListener(new p2(this));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var);
        this.f41295x = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.B(436207615, false);
        kVar.C(-1, false);
        kVar.C(-1, true);
        addView(kVar, k7.b6.e(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new q2(this));
        org.telegram.ui.ActionBar.z n10 = kVar.n();
        r2 r2Var = new r2(this, context, n10, f6Var);
        this.C = r2Var;
        r2Var.setSubMenuOpenSide(1);
        kVar.addView(r2Var, 0, k7.b6.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
        r2Var.setOnClickListener(new View.OnClickListener(this) {
            public final a3 f41649b;

            {
                this.f41649b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41649b.C.M(null, null);
                        return;
                    case 1:
                        a3 a3Var = this.f41649b;
                        if (a3Var.F.getAlpha() >= 0.25f) {
                            a3Var.f(false);
                            return;
                        }
                        return;
                    case 2:
                        a3 a3Var2 = this.f41649b;
                        if (a3Var2.F.getAlpha() >= 0.25f) {
                            a3Var2.f(true);
                            return;
                        }
                        return;
                    default:
                        this.f41649b.f(false);
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f41296y = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.B = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView.setPadding(0, AndroidUtilities.statusBarHeight, AndroidUtilities.dp(10.0f), 0);
        r2Var.addView(textView, k7.b6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, k7.b6.e(-1, -1, 119));
        rl0 rl0Var = new rl0(context, f6Var);
        this.f41291n = rl0Var;
        rl0Var.setLayoutManager(new f2.w(3));
        s2 s2Var = new s2(this);
        this.f41292r = s2Var;
        rl0Var.setAdapter(s2Var);
        rl0Var.setOnScrollListener(new t2(this));
        rl0Var.setClipToPadding(true);
        rl0Var.i(new Object());
        frameLayout.addView(rl0Var, k7.b6.e(-1, -1, 119));
        u00 u00Var = new u00(context, f6Var);
        u00Var.setViewType(2);
        u00Var.setAlpha(0.0f);
        u00Var.setVisibility(8);
        frameLayout.addView(u00Var, k7.b6.e(-1, -1, 119));
        zw0 zw0Var = new zw0(context, u00Var, 11, f6Var);
        this.f41293s = zw0Var;
        ih.s sVar = zw0Var.d;
        sVar.setTextSize(1, 16.0f);
        sVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20256y6, f6Var));
        sVar.setTypeface(null);
        sVar.setText(LocaleController.getString(R.string.SearchImagesType));
        this.v = new i3(this, false, new org.telegram.ui.web.a1(this, 7));
        frameLayout.addView(zw0Var, k7.b6.e(-1, -1, 119));
        rl0Var.setEmptyView(zw0Var);
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new k2(this);
        this.D = a2;
        a2.setVisibility(8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        rl0Var.setOnItemClickListener(new hl0(this) {
            public final a3 f41601b;

            {
                this.f41601b = this;
            }

            @Override
            public final void d(int i11, View view) {
                Utilities.Callback2 callback2;
                switch (r2) {
                    case 0:
                        a3 a3Var = this.f41601b;
                        ArrayList arrayList2 = a3Var.V;
                        ArrayList arrayList3 = a3Var.f41288e0;
                        if (i11 >= 2 && a3Var.T != null && (view instanceof x2)) {
                            x2 x2Var = (x2) view;
                            int i12 = i11 - 2;
                            Bitmap bitmap = null;
                            if (a3Var.W) {
                                if (i12 == 0) {
                                    a3Var.e(a3.f41280g0, true);
                                    return;
                                }
                                i12 = i11 - 3;
                            } else if (a3Var.f41282a0) {
                                if (i12 >= 0 && i12 < arrayList2.size()) {
                                    t6 t6Var = (t6) arrayList2.get(i12);
                                    Utilities.Callback2 callback22 = a3Var.T;
                                    if (t6Var.K) {
                                        bitmap = a3.d(x2Var);
                                    }
                                    callback22.run(t6Var, bitmap);
                                    return;
                                }
                                i12 -= arrayList2.size();
                            }
                            if (i12 >= 0 && i12 < a3Var.f41286c0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) a3Var.f41286c0.get(i12);
                                if (arrayList3.isEmpty() && !a3Var.N) {
                                    Utilities.Callback2 callback23 = a3Var.T;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        bitmap = a3.d(x2Var);
                                    }
                                    callback23.run(photoEntry, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(photoEntry)) {
                                    arrayList3.remove(photoEntry);
                                } else if (arrayList3.size() + 1 > a3Var.O) {
                                    int i13 = -a3Var.K;
                                    a3Var.K = i13;
                                    AndroidUtilities.shakeViewSpring(x2Var, i13);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    return;
                                } else {
                                    arrayList3.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(a3Var.d);
                                a3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        a3 a3Var2 = this.f41601b;
                        s2 s2Var2 = a3Var2.f41292r;
                        org.telegram.ui.ActionBar.w0 w0Var = a3Var2.D;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchContainer());
                        }
                        if (i11 >= 0 && i11 < s2Var2.f42686c.size() && (callback2 = a3Var2.T) != null) {
                            callback2.run(s2Var2.f42686c.get(i11), null);
                            return;
                        }
                        return;
                }
            }
        });
        arrayList.clear();
        if (!z4) {
            ArrayList arrayList2 = MessagesController.getInstance(i10).getStoriesController().f15915w.f42384b;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                t6 t6Var = (t6) obj;
                if (!t6Var.f42414g && !t6Var.f42443w) {
                    this.V.add(t6Var);
                }
            }
        }
        if (z10) {
            this.E = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.F = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19952h5, f6Var));
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
            addView(linearLayout, k7.b6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(AndroidUtilities.dp(32.0f));
            linearLayout.setVisibility(8);
            d p10 = org.telegram.messenger.y3.p(24, context, f6Var, true);
            this.G = p10;
            p10.g(LocaleController.formatPluralStringComma("StoriesCreate", 1), false, true);
            if (!z11) {
                linearLayout.addView(p10, k7.b6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                p10.setOnClickListener(new View.OnClickListener(this) {
                    public final a3 f41649b;

                    {
                        this.f41649b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f41649b.C.M(null, null);
                                return;
                            case 1:
                                a3 a3Var = this.f41649b;
                                if (a3Var.F.getAlpha() >= 0.25f) {
                                    a3Var.f(false);
                                    return;
                                }
                                return;
                            case 2:
                                a3 a3Var2 = this.f41649b;
                                if (a3Var2.F.getAlpha() >= 0.25f) {
                                    a3Var2.f(true);
                                    return;
                                }
                                return;
                            default:
                                this.f41649b.f(false);
                                return;
                        }
                    }
                });
            }
            d p11 = org.telegram.messenger.y3.p(24, context, f6Var, z11);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            lq lqVar = new lq(R.drawable.mini_collage, 0);
            lqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(0.66f));
            spannableStringBuilder.setSpan(lqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StoriesCollage));
            p11.g(spannableStringBuilder, false, true);
            linearLayout.addView(p11, k7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            p11.setOnClickListener(new View.OnClickListener(this) {
                public final a3 f41649b;

                {
                    this.f41649b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f41649b.C.M(null, null);
                            return;
                        case 1:
                            a3 a3Var = this.f41649b;
                            if (a3Var.F.getAlpha() >= 0.25f) {
                                a3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            a3 a3Var2 = this.f41649b;
                            if (a3Var2.F.getAlpha() >= 0.25f) {
                                a3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f41649b.f(false);
                            return;
                    }
                }
            });
        } else {
            this.F = null;
            this.G = null;
            ImageView imageView = new ImageView(context);
            this.E = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.floating_check);
            imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
            k7.d6.b(imageView, 0.1f, 1.5f);
            addView(imageView, k7.b6.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final a3 f41649b;

                {
                    this.f41649b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f41649b.C.M(null, null);
                            return;
                        case 1:
                            a3 a3Var = this.f41649b;
                            if (a3Var.F.getAlpha() >= 0.25f) {
                                a3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            a3 a3Var2 = this.f41649b;
                            if (a3Var2.F.getAlpha() >= 0.25f) {
                                a3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f41649b.f(false);
                            return;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        MediaController.AlbumEntry albumEntry2 = f41280g0;
        if (albumEntry != null && (albumEntry != albumEntry2 || this.V.size() > 0)) {
            this.f41284b0 = albumEntry;
        } else {
            ArrayList arrayList3 = this.f41287d0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f41284b0 = (MediaController.AlbumEntry) this.f41287d0.get(0);
            } else {
                this.f41284b0 = MediaController.allMediaAlbumEntry;
            }
        }
        this.f41286c0 = b(this.f41284b0);
        i();
        MediaController.AlbumEntry albumEntry3 = this.f41284b0;
        if (albumEntry3 == MediaController.allMediaAlbumEntry) {
            this.f41296y.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry3 == albumEntry2) {
            this.f41296y.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            this.f41296y.setText(albumEntry3.bucketName);
        }
    }

    public static Bitmap d(x2 x2Var) {
        Bitmap bitmap;
        if (x2Var != null && (bitmap = x2Var.f42578a) != null && !bitmap.isRecycled()) {
            return Utilities.stackBlurBitmapWithScaleFactor(bitmap, 6.0f);
        }
        return null;
    }

    public final ArrayList b(MediaController.AlbumEntry albumEntry) {
        if (albumEntry == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < albumEntry.photos.size(); i10++) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
            if (!this.I || !photoEntry.isVideo) {
                arrayList.add(photoEntry);
            }
        }
        return arrayList;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.albumsDidLoad;
        v2 v2Var = this.f41289f;
        int i13 = 0;
        if (i10 == i12) {
            h();
            if (this.f41284b0 != null) {
                while (true) {
                    if (i13 >= MediaController.allMediaAlbums.size()) {
                        break;
                    }
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i13);
                    int i14 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f41284b0;
                    if (i14 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f41284b0 = albumEntry;
                        break;
                    }
                    i13++;
                }
            } else {
                ArrayList arrayList = this.f41287d0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f41284b0 = (MediaController.AlbumEntry) this.f41287d0.get(0);
                } else {
                    this.f41284b0 = MediaController.allMediaAlbumEntry;
                }
            }
            this.f41286c0 = b(this.f41284b0);
            this.f41288e0.clear();
            i();
            if (v2Var != null) {
                v2Var.l();
            }
        } else if (i10 == NotificationCenter.storiesDraftsUpdated) {
            ArrayList arrayList2 = this.V;
            arrayList2.clear();
            if (!this.I) {
                ArrayList arrayList3 = MessagesController.getInstance(this.f41281a).getStoriesController().f15915w.f42384b;
                int size = arrayList3.size();
                while (i13 < size) {
                    Object obj = arrayList3.get(i13);
                    i13++;
                    t6 t6Var = (t6) obj;
                    if (!t6Var.f42414g && !t6Var.f42443w) {
                        arrayList2.add(t6Var);
                    }
                }
            }
            h();
            i();
            if (v2Var != null) {
                v2Var.l();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        float f10;
        float g10 = g();
        int i10 = 0;
        if (g10 <= kf.k0.c(32.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, 0)) {
            z4 = true;
        } else {
            z4 = false;
        }
        float e = this.P.e(z4);
        float lerp = AndroidUtilities.lerp(g10, 0.0f, e);
        if (z4 != this.f41294w) {
            this.f41294w = z4;
            c(z4);
            ViewPropertyAnimator animate = this.d.getFastScroll().animate();
            if (this.f41294w) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.f41295x;
        if (kVar != null) {
            kVar.setAlpha(e);
            if (e <= 0.0f) {
                i10 = 8;
            }
            if (kVar.getVisibility() != i10) {
                kVar.setVisibility(i10);
            }
        }
        h51 h51Var = this.f41290f0;
        if (h51Var != null) {
            h51Var.setAlpha(1.0f - e);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f41285c);
        canvas.save();
        canvas.clipRect(0.0f, lerp, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(MediaController.AlbumEntry albumEntry, boolean z4) {
        this.f41284b0 = albumEntry;
        this.f41286c0 = b(albumEntry);
        this.f41288e0.clear();
        i();
        MediaController.AlbumEntry albumEntry2 = this.f41284b0;
        MediaController.AlbumEntry albumEntry3 = MediaController.allMediaAlbumEntry;
        TextView textView = this.f41296y;
        if (albumEntry2 == albumEntry3) {
            textView.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry2 == f41280g0) {
            textView.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            textView.setText(albumEntry2.bucketName);
        }
        this.f41289f.l();
        m2 m2Var = this.e;
        if (z4) {
            wh.o oVar = new wh.o(getContext(), 2);
            oVar.f5712a = 1;
            oVar.f46707p = AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            m2Var.w0(oVar);
            return;
        }
        m2Var.h1(1, AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
    }

    public final void f(boolean z4) {
        Bitmap bitmap;
        x2 x2Var;
        if (this.U != null) {
            ArrayList arrayList = this.f41288e0;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.T.run((MediaController.PhotoEntry) arrayList.get(0), null);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    l2 l2Var = this.d;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                            int i11 = 0;
                            while (true) {
                                if (i11 < l2Var.getChildCount()) {
                                    View childAt = l2Var.getChildAt(i11);
                                    if (childAt instanceof x2) {
                                        x2Var = (x2) childAt;
                                        if (x2Var.P == photoEntry) {
                                            break;
                                        }
                                    }
                                    i11++;
                                } else {
                                    x2Var = null;
                                    break;
                                }
                            }
                            bitmap = d(x2Var);
                        } else {
                            bitmap = null;
                        }
                        arrayList2.add(bitmap);
                    } else {
                        this.U.run(Boolean.valueOf(z4), new ArrayList(arrayList), arrayList2);
                        arrayList.clear();
                        AndroidUtilities.updateVisibleRows(l2Var);
                        j();
                        return;
                    }
                }
            }
        }
    }

    public final int g() {
        int padding;
        l2 l2Var = this.d;
        if (l2Var != null && l2Var.getChildCount() > 0) {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < l2Var.getChildCount(); i11++) {
                View childAt = l2Var.getChildAt(i11);
                if (RecyclerView.R(childAt) > 0) {
                    i10 = Math.min(i10, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i10, getHeight()));
        } else {
            padding = getPadding();
        }
        if (l2Var == null) {
            return padding;
        }
        return AndroidUtilities.lerp(0, padding, l2Var.getAlpha());
    }

    public int getPadding() {
        return (int) (AndroidUtilities.displaySize.y * 0.35f);
    }

    public MediaController.AlbumEntry getSelectedAlbum() {
        return this.f41284b0;
    }

    public String getTitle() {
        int i10;
        if (this.I) {
            i10 = R.string.AddImage;
        } else {
            i10 = R.string.ChoosePhotoOrVideo;
        }
        return LocaleController.getString(i10);
    }

    public final void h() {
        a aVar;
        r2 r2Var = this.C;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r2Var.f20624b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList<MediaController.AlbumEntry> arrayList = MediaController.allMediaAlbums;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f41287d0 = arrayList2;
        Collections.sort(arrayList2, new d4.t(arrayList, 5));
        ArrayList arrayList3 = this.V;
        boolean isEmpty = arrayList3.isEmpty();
        MediaController.AlbumEntry albumEntry = f41280g0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.f41287d0;
            arrayList4.add(!arrayList4.isEmpty(), albumEntry);
        }
        boolean isEmpty2 = this.f41287d0.isEmpty();
        TextView textView = this.f41296y;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.B, (Drawable) null);
        int size = this.f41287d0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) this.f41287d0.get(i10);
            if (albumEntry2 == albumEntry) {
                aVar = new a(getContext(), albumEntry2.coverPhoto, LocaleController.getString("StoryDraftsAlbum"), arrayList3.size(), this.f41283b);
            } else {
                ArrayList b10 = b(albumEntry2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), albumEntry2.coverPhoto, albumEntry2.bucketName, b10.size(), this.f41283b);
                }
            }
            r2Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ib0(28, this, albumEntry2));
        }
    }

    public final void i() {
        boolean z4;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f41287d0;
        boolean z10 = true;
        if (arrayList2 != null && !arrayList2.isEmpty() && this.f41287d0.get(0) == this.f41284b0 && this.V.size() > 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.W = z4;
        if (z4 || (this.f41284b0 != f41280g0 && ((arrayList = this.f41287d0) == null || arrayList.isEmpty() || this.f41287d0.get(0) != this.f41284b0))) {
            z10 = false;
        }
        this.f41282a0 = z10;
    }

    public final void j() {
        float f10;
        float f11;
        int dp;
        ArrayList arrayList = this.f41288e0;
        boolean isEmpty = arrayList.isEmpty();
        boolean z4 = !isEmpty;
        float f12 = 0.0f;
        float f13 = 1.0f;
        ImageView imageView = this.E;
        if (imageView != null) {
            ViewPropertyAnimator animate = imageView.animate();
            if (!isEmpty) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            float f14 = 0.7f;
            if (!isEmpty) {
                f11 = 1.0f;
            } else {
                f11 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (!isEmpty) {
                f14 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f14);
            if (!isEmpty) {
                dp = -AndroidUtilities.navigationBarHeight;
            } else {
                dp = AndroidUtilities.dp(8.0f);
            }
            org.telegram.ui.b.p(scaleY.translationY(dp), mr.h, 320L);
        }
        LinearLayout linearLayout = this.F;
        if (linearLayout != null) {
            d dVar = this.G;
            if (dVar != null) {
                dVar.g(LocaleController.formatPluralStringComma("StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            float f15 = 10.0f;
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(10.0f);
            if (AndroidUtilities.navigationBarHeight > 0) {
                f15 = 0.0f;
            }
            linearLayout.setPadding(dp2, dp3, dp4, AndroidUtilities.dp(f15) + AndroidUtilities.navigationBarHeight);
            if (this.Q != z4) {
                this.Q = z4;
                linearLayout.setVisibility(0);
                ViewPropertyAnimator animate2 = linearLayout.animate();
                if (isEmpty) {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f13);
                if (isEmpty) {
                    f12 = AndroidUtilities.dp(32.0f);
                }
                alpha2.translationY(f12).setInterpolator(mr.h).setDuration(320L).setListener(new s61(9, this, z4)).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.f41281a).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.f41281a).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
        x2.f42576b0.clear();
        x2.f42577c0.evictAll();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = x2.W;
            if (i10 < arrayList.size()) {
                ((DispatchQueue) arrayList.get(i10)).cleanupQueue();
                ((DispatchQueue) arrayList.get(i10)).recycle();
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        float f10;
        float f11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        l2 l2Var = this.d;
        l2Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int dp2 = AndroidUtilities.dp(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        int dp3 = AndroidUtilities.dp(1.0f);
        LinearLayout linearLayout = this.F;
        if (linearLayout == null) {
            dp = 0;
        } else {
            if (AndroidUtilities.navigationBarHeight > 0) {
                i12 = 0;
            } else {
                i12 = 10;
            }
            dp = AndroidUtilities.dp(i12 + 114);
        }
        l2Var.setPadding(dp2, currentActionBarHeight2, dp3, dp + AndroidUtilities.navigationBarHeight);
        ImageView imageView = this.E;
        if (imageView != null) {
            imageView.setTranslationY(-AndroidUtilities.navigationBarHeight);
        }
        if (linearLayout != null) {
            int dp4 = AndroidUtilities.dp(10.0f);
            int dp5 = AndroidUtilities.dp(10.0f);
            int dp6 = AndroidUtilities.dp(10.0f);
            if (AndroidUtilities.navigationBarHeight > 0) {
                f11 = 0.0f;
            } else {
                f11 = 10.0f;
            }
            linearLayout.setPadding(dp4, dp5, dp6, AndroidUtilities.dp(f11) + AndroidUtilities.navigationBarHeight);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = AndroidUtilities.navigationBarHeight;
        int i13 = AndroidUtilities.statusBarHeight;
        int dp7 = AndroidUtilities.dp(10.0f);
        TextView textView = this.f41296y;
        textView.setPadding(0, i13, dp7, 0);
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                f10 = 18.0f;
                textView.setTextSize(f10);
                super.onMeasure(i10, i11);
            }
        }
        f10 = 20.0f;
        textView.setTextSize(f10);
        super.onMeasure(i10, i11);
    }

    public void setMaxCount(int i10) {
        this.O = i10;
    }

    public void setMultipleOnClick(boolean z4) {
        if (this.N != z4) {
            this.N = z4;
            AndroidUtilities.updateVisibleRows(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.S = runnable;
    }

    public void setOnSelectListener(Utilities.Callback2<Object, Bitmap> callback2) {
        this.T = callback2;
    }

    public void setOnSelectMultipleListener(Utilities.Callback3<Boolean, ArrayList<MediaController.PhotoEntry>, ArrayList<Bitmap>> callback3) {
        this.U = callback3;
    }

    public void a() {
    }

    public void c(boolean z4) {
    }
}
