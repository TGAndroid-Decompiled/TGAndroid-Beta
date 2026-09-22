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
public final class r61 extends org.telegram.ui.Components.kl0 {
    public int f37042c;
    public int d;
    public int h;
    public final h71 f37046s;
    public int e = -1;
    public int f37043f = -1;
    public int f37044n = 1;
    public final ArrayList f37045r = new ArrayList();

    public r61(h71 h71Var) {
        this.f37046s = h71Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42674f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        h71 h71Var = this.f37046s;
        int i10 = h71Var.W;
        boolean z11 = h71Var.I;
        ArrayList arrayList = this.f37045r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f37042c = -1;
        boolean z12 = false;
        this.f37044n = 0;
        arrayList.clear();
        ArrayList arrayList2 = h71Var.A1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f37044n;
                this.f37044n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.f37044n;
            for (int i12 = 0; i12 < h71Var.A1.size(); i12++) {
                this.f37044n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, h71Var.A1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = h71Var.B1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f37044n;
                this.f37044n = i13 + 1;
                this.f37043f = i13;
                arrayList.add(2);
                this.f37042c = this.f37044n;
                for (int i14 = 0; i14 < h71Var.B1.size(); i14++) {
                    this.f37044n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, h71Var.B1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = h71Var.C1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f37044n;
                    this.f37044n = i15 + 1;
                    this.f37043f = i15;
                    arrayList.add(2);
                }
                this.f37042c = this.f37044n;
                for (int i16 = 0; i16 < h71Var.C1.size(); i16++) {
                    this.f37044n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, h71Var.C1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = h71Var.D1;
        if (arrayList5 != null) {
            int i17 = this.f37044n;
            this.h = i17;
            this.f37044n = arrayList5.size() + i17;
        }
        l();
        if (h71Var.f34171y1 && this.f37044n == 0) {
            z12 = true;
        }
        if (h71Var.G1 != z12) {
            h71Var.G1 = z12;
            ValueAnimator valueAnimator = h71Var.H1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            h71Var.H1 = ofFloat;
            ofFloat.addUpdateListener(new n51(h71Var, z12, 1));
            h71Var.H1.addListener(new a61(h71Var, z12, 1));
            h71Var.H1.setInterpolator(org.telegram.ui.Components.qr.h);
            h71Var.H1.setDuration(100L);
            h71Var.H1.start();
            if (z12) {
                h71.D(h71Var.V, h71Var.f34140l0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f37044n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f37043f) {
            return 6;
        }
        h71 h71Var = this.f37046s;
        if (h71Var.W == 14) {
            ArrayList arrayList = h71Var.B1;
            if (arrayList != null && i10 >= (i11 = this.f37042c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f37042c;
            if (i10 > i12 && (i10 - i12) - 1 < h71Var.C1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = h71Var.A1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (h71Var.W == 13 || ((zg.p0) h71Var.A1.get((i10 - this.d) - 1)).f49121g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= h71Var.D1.size()) {
            return 4;
        }
        if (h71Var.D1.get(i10 - this.h) instanceof e71) {
            return 6;
        }
        return 3;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.Document document;
        Long l4;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        zg.p0 p0Var;
        int cacheType2;
        int i13;
        int indexOf;
        h71 h71Var = this.f37046s;
        HashSet hashSet = h71Var.K;
        int i14 = h71Var.W;
        int i15 = h71Var.V;
        u51 u51Var = h71Var.f34134i0;
        int i16 = c1Var.f42674f;
        View view = c1Var.f42671a;
        if (i16 == 6) {
            m61 m61Var = (m61) view;
            ArrayList arrayList = h71Var.D1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) h71Var.D1.get(i10 - this.h);
                if (document2 instanceof e71) {
                    CharSequence charSequence = ((e71) document2).f33214a;
                    String str = h71Var.f34173z1;
                    m61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Ue, m61Var.f35622f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    m61Var.f35619a.setText(charSequence);
                    m61Var.b(false);
                }
            } else if (i10 == this.e) {
                m61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                m61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                m61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            m61Var.f35621c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) h71Var.C1.get((i10 - this.f37042c) - 1);
            q61 q61Var = (q61) view;
            q61Var.a(u51Var);
            q61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.i6.f18998m6, 0.2f), 0L, "tgs", document3, 0);
            q61Var.Q = true;
            q61Var.d = document3;
            q61Var.e = null;
        } else if (i16 == 4) {
            q61 q61Var2 = (q61) view;
            q61Var2.f36770c = i10;
            ImageReceiver imageReceiver = q61Var2.f36772n;
            ArrayList arrayList2 = h71Var.A1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                p0Var = (zg.p0) h71Var.A1.get(i10);
            } else {
                ArrayList arrayList3 = h71Var.B1;
                if (arrayList3 != null && i10 >= (i12 = this.f37042c) && i10 - i12 < arrayList3.size()) {
                    p0Var = (zg.p0) h71Var.B1.get(i10 - this.f37042c);
                } else {
                    return;
                }
            }
            if (q61Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(q61Var2);
                q61Var2.h = imageReceiver2;
                imageReceiver2.setLayerNum(7);
                q61Var2.h.onAttachedToWindow();
            }
            q61Var2.h.setParentView(u51Var);
            q61Var2.f36776x = p0Var;
            q61Var2.f36777y = false;
            q61Var2.d(h71Var.J.contains(p0Var), false);
            q61Var2.f36769b = false;
            q61Var2.invalidate();
            if (i14 == 13) {
                q61Var2.setDrawable(Emoji.getEmojiDrawable(p0Var.f49120f));
            } else if (!p0Var.f49118b && p0Var.f49120f != null) {
                q61Var2.f36774s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(p0Var.f49120f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.i6.f18998m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        q61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", p0Var, 0);
                    } else {
                        zg.p0 p0Var2 = p0Var;
                        q61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", p0Var2, 0);
                        p0Var = p0Var2;
                    }
                    MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.l0.a());
                } else {
                    q61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                q61Var2.e = null;
                q61Var2.d = null;
                q61Var2.setDrawable(null);
                p61 p61Var = q61Var2.J;
                if (p61Var != null) {
                    p61Var.setVisibility(8);
                    q61Var2.J.setImageReceiver(null);
                }
                if (tL_availableReaction == null && p0Var.f49118b) {
                    q61Var2.setDrawable(Emoji.getEmojiDrawable(p0Var.f49120f));
                }
            } else {
                q61Var2.f36774s = false;
                q61Var2.e = new org.telegram.ui.Components.x5(p0Var.f49121g, (Paint.FontMetricsInt) null);
                q61Var2.d = null;
                q61Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) u51Var.f34804d3.get(q61Var2.e.getDocumentId());
                if (o5Var == null) {
                    cacheType2 = h71Var.getCacheType();
                    o5Var = org.telegram.ui.Components.o5.n(i15, q61Var2.e.getDocumentId(), null, cacheType2);
                    u51Var.f34804d3.put(q61Var2.e.getDocumentId(), o5Var);
                }
                q61Var2.setDrawable(o5Var);
            }
            if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && p0Var.f49118b && p0Var.d) {
                q61Var2.b();
                q61Var2.J.setVisibility(0);
                q61Var2.setEmojicon(null);
                return;
            }
            if (p0Var.e) {
                q61Var2.setEmojicon(p0Var.f49120f);
            } else {
                q61Var2.setEmojicon(null);
            }
            p61 p61Var2 = q61Var2.J;
            if (p61Var2 != null) {
                p61Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            q61 q61Var3 = (q61) view;
            q61Var3.f36768a = false;
            q61Var3.f36770c = i10;
            q61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            q61Var3.setDrawable(null);
            ArrayList arrayList4 = h71Var.A1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                zg.p0 p0Var3 = (zg.p0) h71Var.A1.get(i10);
                q61Var3.f36776x = p0Var3;
                long j3 = p0Var3.f49121g;
                if (j3 == 0) {
                    boolean contains2 = h71Var.J.contains(p0Var3);
                    q61Var3.f36777y = true;
                    q61Var3.setDrawable(Emoji.getEmojiDrawable(p0Var3.f49120f));
                    q61Var3.d(contains2, false);
                    return;
                }
                l4 = Long.valueOf(j3);
                if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && p0Var3.f49118b && p0Var3.d) {
                    q61Var3.b();
                    q61Var3.J.setVisibility(0);
                } else {
                    p61 p61Var3 = q61Var3.J;
                    if (p61Var3 != null) {
                        p61Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = h71Var.D1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) h71Var.D1.get(i10 - this.h);
                    if (!(document instanceof e71)) {
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
                    q61Var3.e = new org.telegram.ui.Components.x5(document, (Paint.FontMetricsInt) null);
                    q61Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f18115id));
                } else {
                    org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(l4.longValue(), (Paint.FontMetricsInt) null);
                    q61Var3.e = x5Var;
                    q61Var3.d = x5Var.document;
                    contains = hashSet.contains(l4);
                }
                org.telegram.ui.Components.o5 o5Var2 = (org.telegram.ui.Components.o5) u51Var.f34804d3.get(q61Var3.e.getDocumentId());
                if (o5Var2 == null) {
                    cacheType = h71Var.getCacheType();
                    o5Var2 = org.telegram.ui.Components.o5.n(i15, q61Var3.e.getDocumentId(), null, cacheType);
                    u51Var.f34804d3.put(q61Var3.e.getDocumentId(), o5Var2);
                }
                q61Var3.setDrawable(o5Var2);
            }
            q61Var3.d(contains, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View q61Var;
        boolean z10;
        h71 h71Var = this.f37046s;
        if (i10 == 6) {
            Context context = h71Var.getContext();
            if (h71Var.W == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            q61Var = new m61(h71Var, context, z10);
        } else if (i10 == 7) {
            q61Var = new org.telegram.ui.Components.kn(h71Var.getContext(), 25);
            q61Var.setTag("searchbox");
        } else {
            q61Var = new q61(h71Var, h71Var.getContext());
        }
        if (h71.c(h71Var)) {
            q61Var.setScaleX(0.0f);
            q61Var.setScaleY(0.0f);
        }
        return new s4.c1(q61Var);
    }
}
