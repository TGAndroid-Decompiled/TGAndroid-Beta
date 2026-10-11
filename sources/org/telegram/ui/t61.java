package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class t61 extends org.telegram.ui.Components.rm0 {
    public int f42089c;
    public int d;
    public int h;
    public final j71 f42094s;
    public int f42090e = -1;
    public int f42091f = -1;
    public int f42092n = 1;
    public final ArrayList f42093r = new ArrayList();

    public t61(j71 j71Var) {
        this.f42094s = j71Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47752f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        j71 j71Var = this.f42094s;
        int i10 = j71Var.W;
        boolean z11 = j71Var.I;
        ArrayList arrayList = this.f42093r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f42089c = -1;
        boolean z12 = false;
        this.f42092n = 0;
        arrayList.clear();
        ArrayList arrayList2 = j71Var.A1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f42092n;
                this.f42092n = i11 + 1;
                this.f42090e = i11;
                arrayList.add(1);
            }
            this.d = this.f42092n;
            for (int i12 = 0; i12 < j71Var.A1.size(); i12++) {
                this.f42092n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, j71Var.A1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = j71Var.B1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f42092n;
                this.f42092n = i13 + 1;
                this.f42091f = i13;
                arrayList.add(2);
                this.f42089c = this.f42092n;
                for (int i14 = 0; i14 < j71Var.B1.size(); i14++) {
                    this.f42092n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, j71Var.B1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = j71Var.C1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f42092n;
                    this.f42092n = i15 + 1;
                    this.f42091f = i15;
                    arrayList.add(2);
                }
                this.f42089c = this.f42092n;
                for (int i16 = 0; i16 < j71Var.C1.size(); i16++) {
                    this.f42092n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, j71Var.C1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = j71Var.D1;
        if (arrayList5 != null) {
            int i17 = this.f42092n;
            this.h = i17;
            this.f42092n = arrayList5.size() + i17;
        }
        l();
        if (j71Var.f38933y1 && this.f42092n == 0) {
            z12 = true;
        }
        if (j71Var.G1 != z12) {
            j71Var.G1 = z12;
            ValueAnimator valueAnimator = j71Var.H1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            j71Var.H1 = ofFloat;
            ofFloat.addUpdateListener(new o51(j71Var, z12, 1));
            j71Var.H1.addListener(new c61(j71Var, z12, 1));
            j71Var.H1.setInterpolator(org.telegram.ui.Components.is.h);
            j71Var.H1.setDuration(100L);
            j71Var.H1.start();
            if (z12) {
                j71.D(j71Var.V, j71Var.f38902l0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f42092n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.f42090e || i10 == this.f42091f) {
            return 6;
        }
        j71 j71Var = this.f42094s;
        if (j71Var.W == 14) {
            ArrayList arrayList = j71Var.B1;
            if (arrayList != null && i10 >= (i11 = this.f42089c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f42089c;
            if (i10 > i12 && (i10 - i12) - 1 < j71Var.C1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = j71Var.A1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (j71Var.W == 13 || ((zg.n0) j71Var.A1.get((i10 - this.d) - 1)).f54705g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= j71Var.D1.size()) {
            return 4;
        }
        if (j71Var.D1.get(i10 - this.h) instanceof g71) {
            return 6;
        }
        return 3;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        TLRPC.Document document;
        Long l4;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        zg.n0 n0Var;
        int cacheType2;
        int i13;
        int indexOf;
        j71 j71Var = this.f42094s;
        HashSet hashSet = j71Var.K;
        int i14 = j71Var.W;
        int i15 = j71Var.V;
        w51 w51Var = j71Var.f38896i0;
        int i16 = d1Var.f47752f;
        View view = d1Var.f47748a;
        if (i16 == 6) {
            o61 o61Var = (o61) view;
            ArrayList arrayList = j71Var.D1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) j71Var.D1.get(i10 - this.h);
                if (document2 instanceof g71) {
                    CharSequence charSequence = ((g71) document2).f37980a;
                    String str = j71Var.f38935z1;
                    o61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ue, o61Var.f40433f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    o61Var.f40429a.setText(charSequence);
                    o61Var.b(false);
                }
            } else if (i10 == this.f42090e) {
                o61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                o61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                o61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            o61Var.f40431c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) j71Var.C1.get((i10 - this.f42089c) - 1);
            s61 s61Var = (s61) view;
            s61Var.a(w51Var);
            s61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.h6.f20951m6, 0.2f), 0L, "tgs", document3, 0);
            s61Var.Q = true;
            s61Var.d = document3;
            s61Var.f41603e = null;
        } else if (i16 == 4) {
            s61 s61Var2 = (s61) view;
            s61Var2.f41602c = i10;
            ImageReceiver imageReceiver = s61Var2.f41605n;
            ArrayList arrayList2 = j71Var.A1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                n0Var = (zg.n0) j71Var.A1.get(i10);
            } else {
                ArrayList arrayList3 = j71Var.B1;
                if (arrayList3 != null && i10 >= (i12 = this.f42089c) && i10 - i12 < arrayList3.size()) {
                    n0Var = (zg.n0) j71Var.B1.get(i10 - this.f42089c);
                } else {
                    return;
                }
            }
            if (s61Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(s61Var2);
                s61Var2.h = imageReceiver2;
                imageReceiver2.setLayerNum(7);
                s61Var2.h.onAttachedToWindow();
            }
            s61Var2.h.setParentView(w51Var);
            s61Var2.f41609x = n0Var;
            s61Var2.f41610y = false;
            s61Var2.d(j71Var.J.contains(n0Var), false);
            s61Var2.f41601b = false;
            s61Var2.invalidate();
            if (i14 == 13) {
                s61Var2.setDrawable(Emoji.getEmojiDrawable(n0Var.f54704f));
            } else if (!n0Var.f54701b && n0Var.f54704f != null) {
                s61Var2.f41607s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(n0Var.f54704f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.h6.f20951m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        s61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", n0Var, 0);
                    } else {
                        zg.n0 n0Var2 = n0Var;
                        s61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", n0Var2, 0);
                        n0Var = n0Var2;
                    }
                    MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.j0.a());
                } else {
                    s61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                s61Var2.f41603e = null;
                s61Var2.d = null;
                s61Var2.setDrawable(null);
                r61 r61Var = s61Var2.J;
                if (r61Var != null) {
                    r61Var.setVisibility(8);
                    s61Var2.J.setImageReceiver(null);
                }
                if (tL_availableReaction == null && n0Var.f54701b) {
                    s61Var2.setDrawable(Emoji.getEmojiDrawable(n0Var.f54704f));
                }
            } else {
                s61Var2.f41607s = false;
                s61Var2.f41603e = new org.telegram.ui.Components.b6(n0Var.f54705g, (Paint.FontMetricsInt) null);
                s61Var2.d = null;
                s61Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) w51Var.f39527b3.get(s61Var2.f41603e.getDocumentId());
                if (s5Var == null) {
                    cacheType2 = j71Var.getCacheType();
                    s5Var = org.telegram.ui.Components.s5.n(i15, s61Var2.f41603e.getDocumentId(), null, cacheType2);
                    w51Var.f39527b3.put(s61Var2.f41603e.getDocumentId(), s5Var);
                }
                s61Var2.setDrawable(s5Var);
            }
            if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && n0Var.f54701b && n0Var.d) {
                s61Var2.b();
                s61Var2.J.setVisibility(0);
                s61Var2.setEmojicon(null);
                return;
            }
            if (n0Var.f54703e) {
                s61Var2.setEmojicon(n0Var.f54704f);
            } else {
                s61Var2.setEmojicon(null);
            }
            r61 r61Var2 = s61Var2.J;
            if (r61Var2 != null) {
                r61Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            s61 s61Var3 = (s61) view;
            s61Var3.f41600a = false;
            s61Var3.f41602c = i10;
            s61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            s61Var3.setDrawable(null);
            ArrayList arrayList4 = j71Var.A1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                zg.n0 n0Var3 = (zg.n0) j71Var.A1.get(i10);
                s61Var3.f41609x = n0Var3;
                long j3 = n0Var3.f54705g;
                if (j3 == 0) {
                    boolean contains2 = j71Var.J.contains(n0Var3);
                    s61Var3.f41610y = true;
                    s61Var3.setDrawable(Emoji.getEmojiDrawable(n0Var3.f54704f));
                    s61Var3.d(contains2, false);
                    return;
                }
                l4 = Long.valueOf(j3);
                if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && n0Var3.f54701b && n0Var3.d) {
                    s61Var3.b();
                    s61Var3.J.setVisibility(0);
                } else {
                    r61 r61Var3 = s61Var3.J;
                    if (r61Var3 != null) {
                        r61Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = j71Var.D1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) j71Var.D1.get(i10 - this.h);
                    if (!(document instanceof g71)) {
                        l4 = null;
                    }
                }
                document = null;
                l4 = null;
            }
            if (l4 == null && document == null) {
                contains = false;
            } else {
                if (document != null) {
                    s61Var3.f41603e = new org.telegram.ui.Components.b6(document, (Paint.FontMetricsInt) null);
                    s61Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f20038id));
                } else {
                    org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(l4.longValue(), (Paint.FontMetricsInt) null);
                    s61Var3.f41603e = b6Var;
                    s61Var3.d = b6Var.document;
                    contains = hashSet.contains(l4);
                }
                org.telegram.ui.Components.s5 s5Var2 = (org.telegram.ui.Components.s5) w51Var.f39527b3.get(s61Var3.f41603e.getDocumentId());
                if (s5Var2 == null) {
                    cacheType = j71Var.getCacheType();
                    s5Var2 = org.telegram.ui.Components.s5.n(i15, s61Var3.f41603e.getDocumentId(), null, cacheType);
                    w51Var.f39527b3.put(s61Var3.f41603e.getDocumentId(), s5Var2);
                }
                s61Var3.setDrawable(s5Var2);
            }
            s61Var3.d(contains, false);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View s61Var;
        boolean z10;
        j71 j71Var = this.f42094s;
        if (i10 == 6) {
            Context context = j71Var.getContext();
            if (j71Var.W == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            s61Var = new o61(j71Var, context, z10);
        } else if (i10 == 7) {
            s61Var = new org.telegram.ui.Components.ao(j71Var.getContext(), 25);
            s61Var.setTag("searchbox");
        } else {
            s61Var = new s61(j71Var, j71Var.getContext());
        }
        if (j71.c(j71Var)) {
            s61Var.setScaleX(0.0f);
            s61Var.setScaleY(0.0f);
        }
        return new s4.d1(s61Var);
    }
}
