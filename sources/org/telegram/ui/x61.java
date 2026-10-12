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
public final class x61 extends org.telegram.ui.Components.vm0 {
    public int f43779c;
    public int d;
    public int h;
    public final n71 f43784s;
    public int f43780e = -1;
    public int f43781f = -1;
    public int f43782n = 1;
    public final ArrayList f43783r = new ArrayList();

    public x61(n71 n71Var) {
        this.f43784s = n71Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47901f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        n71 n71Var = this.f43784s;
        int i10 = n71Var.W;
        boolean z11 = n71Var.I;
        ArrayList arrayList = this.f43783r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f43779c = -1;
        boolean z12 = false;
        this.f43782n = 0;
        arrayList.clear();
        ArrayList arrayList2 = n71Var.A1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f43782n;
                this.f43782n = i11 + 1;
                this.f43780e = i11;
                arrayList.add(1);
            }
            this.d = this.f43782n;
            for (int i12 = 0; i12 < n71Var.A1.size(); i12++) {
                this.f43782n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, n71Var.A1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = n71Var.B1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f43782n;
                this.f43782n = i13 + 1;
                this.f43781f = i13;
                arrayList.add(2);
                this.f43779c = this.f43782n;
                for (int i14 = 0; i14 < n71Var.B1.size(); i14++) {
                    this.f43782n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, n71Var.B1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = n71Var.C1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f43782n;
                    this.f43782n = i15 + 1;
                    this.f43781f = i15;
                    arrayList.add(2);
                }
                this.f43779c = this.f43782n;
                for (int i16 = 0; i16 < n71Var.C1.size(); i16++) {
                    this.f43782n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, n71Var.C1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = n71Var.D1;
        if (arrayList5 != null) {
            int i17 = this.f43782n;
            this.h = i17;
            this.f43782n = arrayList5.size() + i17;
        }
        l();
        if (n71Var.f40314y1 && this.f43782n == 0) {
            z12 = true;
        }
        if (n71Var.G1 != z12) {
            n71Var.G1 = z12;
            ValueAnimator valueAnimator = n71Var.H1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            n71Var.H1 = ofFloat;
            ofFloat.addUpdateListener(new s51(n71Var, z12, 1));
            n71Var.H1.addListener(new g61(n71Var, z12, 1));
            n71Var.H1.setInterpolator(org.telegram.ui.Components.js.h);
            n71Var.H1.setDuration(100L);
            n71Var.H1.start();
            if (z12) {
                n71.D(n71Var.V, n71Var.f40283l0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f43782n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.f43780e || i10 == this.f43781f) {
            return 6;
        }
        n71 n71Var = this.f43784s;
        if (n71Var.W == 14) {
            ArrayList arrayList = n71Var.B1;
            if (arrayList != null && i10 >= (i11 = this.f43779c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f43779c;
            if (i10 > i12 && (i10 - i12) - 1 < n71Var.C1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = n71Var.A1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (n71Var.W == 13 || ((zg.n0) n71Var.A1.get((i10 - this.d) - 1)).f54850g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= n71Var.D1.size()) {
            return 4;
        }
        if (n71Var.D1.get(i10 - this.h) instanceof k71) {
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
        n71 n71Var = this.f43784s;
        HashSet hashSet = n71Var.K;
        int i14 = n71Var.W;
        int i15 = n71Var.V;
        a61 a61Var = n71Var.f40277i0;
        int i16 = d1Var.f47901f;
        View view = d1Var.f47897a;
        if (i16 == 6) {
            s61 s61Var = (s61) view;
            ArrayList arrayList = n71Var.D1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) n71Var.D1.get(i10 - this.h);
                if (document2 instanceof k71) {
                    CharSequence charSequence = ((k71) document2).f39372a;
                    String str = n71Var.f40316z1;
                    s61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ue, s61Var.f41824f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    s61Var.f41820a.setText(charSequence);
                    s61Var.b(false);
                }
            } else if (i10 == this.f43780e) {
                s61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                s61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                s61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            s61Var.f41822c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) n71Var.C1.get((i10 - this.f43779c) - 1);
            w61 w61Var = (w61) view;
            w61Var.a(a61Var);
            w61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.h6.f20725m6, 0.2f), 0L, "tgs", document3, 0);
            w61Var.Q = true;
            w61Var.d = document3;
            w61Var.f43057e = null;
        } else if (i16 == 4) {
            w61 w61Var2 = (w61) view;
            w61Var2.f43056c = i10;
            ImageReceiver imageReceiver = w61Var2.f43059n;
            ArrayList arrayList2 = n71Var.A1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                n0Var = (zg.n0) n71Var.A1.get(i10);
            } else {
                ArrayList arrayList3 = n71Var.B1;
                if (arrayList3 != null && i10 >= (i12 = this.f43779c) && i10 - i12 < arrayList3.size()) {
                    n0Var = (zg.n0) n71Var.B1.get(i10 - this.f43779c);
                } else {
                    return;
                }
            }
            if (w61Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(w61Var2);
                w61Var2.h = imageReceiver2;
                imageReceiver2.setLayerNum(7);
                w61Var2.h.onAttachedToWindow();
            }
            w61Var2.h.setParentView(a61Var);
            w61Var2.f43063x = n0Var;
            w61Var2.f43064y = false;
            w61Var2.d(n71Var.J.contains(n0Var), false);
            w61Var2.f43055b = false;
            w61Var2.invalidate();
            if (i14 == 13) {
                w61Var2.setDrawable(Emoji.getEmojiDrawable(n0Var.f54849f));
            } else if (!n0Var.f54846b && n0Var.f54849f != null) {
                w61Var2.f43061s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(n0Var.f54849f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.h6.f20725m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        w61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", n0Var, 0);
                    } else {
                        zg.n0 n0Var2 = n0Var;
                        w61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", n0Var2, 0);
                        n0Var = n0Var2;
                    }
                    MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.j0.a());
                } else {
                    w61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                w61Var2.f43057e = null;
                w61Var2.d = null;
                w61Var2.setDrawable(null);
                v61 v61Var = w61Var2.J;
                if (v61Var != null) {
                    v61Var.setVisibility(8);
                    w61Var2.J.setImageReceiver(null);
                }
                if (tL_availableReaction == null && n0Var.f54846b) {
                    w61Var2.setDrawable(Emoji.getEmojiDrawable(n0Var.f54849f));
                }
            } else {
                w61Var2.f43061s = false;
                w61Var2.f43057e = new org.telegram.ui.Components.b6(n0Var.f54850g, (Paint.FontMetricsInt) null);
                w61Var2.d = null;
                w61Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) a61Var.f40866b3.get(w61Var2.f43057e.getDocumentId());
                if (s5Var == null) {
                    cacheType2 = n71Var.getCacheType();
                    s5Var = org.telegram.ui.Components.s5.n(i15, w61Var2.f43057e.getDocumentId(), null, cacheType2);
                    a61Var.f40866b3.put(w61Var2.f43057e.getDocumentId(), s5Var);
                }
                w61Var2.setDrawable(s5Var);
            }
            if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && n0Var.f54846b && n0Var.d) {
                w61Var2.b();
                w61Var2.J.setVisibility(0);
                w61Var2.setEmojicon(null);
                return;
            }
            if (n0Var.f54848e) {
                w61Var2.setEmojicon(n0Var.f54849f);
            } else {
                w61Var2.setEmojicon(null);
            }
            v61 v61Var2 = w61Var2.J;
            if (v61Var2 != null) {
                v61Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            w61 w61Var3 = (w61) view;
            w61Var3.f43054a = false;
            w61Var3.f43056c = i10;
            w61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            w61Var3.setDrawable(null);
            ArrayList arrayList4 = n71Var.A1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                zg.n0 n0Var3 = (zg.n0) n71Var.A1.get(i10);
                w61Var3.f43063x = n0Var3;
                long j3 = n0Var3.f54850g;
                if (j3 == 0) {
                    boolean contains2 = n71Var.J.contains(n0Var3);
                    w61Var3.f43064y = true;
                    w61Var3.setDrawable(Emoji.getEmojiDrawable(n0Var3.f54849f));
                    w61Var3.d(contains2, false);
                    return;
                }
                l4 = Long.valueOf(j3);
                if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && n0Var3.f54846b && n0Var3.d) {
                    w61Var3.b();
                    w61Var3.J.setVisibility(0);
                } else {
                    v61 v61Var3 = w61Var3.J;
                    if (v61Var3 != null) {
                        v61Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = n71Var.D1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) n71Var.D1.get(i10 - this.h);
                    if (!(document instanceof k71)) {
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
                    w61Var3.f43057e = new org.telegram.ui.Components.b6(document, (Paint.FontMetricsInt) null);
                    w61Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f19809id));
                } else {
                    org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(l4.longValue(), (Paint.FontMetricsInt) null);
                    w61Var3.f43057e = b6Var;
                    w61Var3.d = b6Var.document;
                    contains = hashSet.contains(l4);
                }
                org.telegram.ui.Components.s5 s5Var2 = (org.telegram.ui.Components.s5) a61Var.f40866b3.get(w61Var3.f43057e.getDocumentId());
                if (s5Var2 == null) {
                    cacheType = n71Var.getCacheType();
                    s5Var2 = org.telegram.ui.Components.s5.n(i15, w61Var3.f43057e.getDocumentId(), null, cacheType);
                    a61Var.f40866b3.put(w61Var3.f43057e.getDocumentId(), s5Var2);
                }
                w61Var3.setDrawable(s5Var2);
            }
            w61Var3.d(contains, false);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View w61Var;
        boolean z10;
        n71 n71Var = this.f43784s;
        if (i10 == 6) {
            Context context = n71Var.getContext();
            if (n71Var.W == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            w61Var = new s61(n71Var, context, z10);
        } else if (i10 == 7) {
            w61Var = new org.telegram.ui.Components.co(n71Var.getContext(), 25);
            w61Var.setTag("searchbox");
        } else {
            w61Var = new w61(n71Var, n71Var.getContext());
        }
        if (n71.c(n71Var)) {
            w61Var.setScaleX(0.0f);
            w61Var.setScaleY(0.0f);
        }
        return new s4.d1(w61Var);
    }
}
