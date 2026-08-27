package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
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
import org.telegram.tgnet.tl.TL_stars;

public final class z41 extends org.telegram.ui.Components.yk0 {

    public final a61 f45028c;

    public z41(a61 a61Var) {
        this.f45028c = a61Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8;
    }

    @Override
    public final int h() {
        return this.f45028c.f36419q0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f45028c.f36422r0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        a61 a61Var = this.f45028c;
        if (i10 == a61Var.f36383a) {
            return 7;
        }
        if (i10 >= a61Var.f36386b && i10 < a61Var.f36389c) {
            return 1;
        }
        if (i10 >= a61Var.d && i10 < a61Var.f36394e) {
            return 1;
        }
        if (i10 >= a61Var.A && i10 < a61Var.B) {
            return 1;
        }
        if (i10 >= a61Var.f36421r && i10 < a61Var.f36424s) {
            return 3;
        }
        if (a61Var.f36429u0.indexOfKey(i10) >= 0) {
            return 4;
        }
        if (a61Var.f36431v0.indexOfKey(i10) >= 0) {
            return 5;
        }
        if (i10 == a61Var.v) {
            return 6;
        }
        if (a61Var.f36425s0.indexOfKey(i10) >= 0 || i10 == a61Var.f36397f || i10 == a61Var.f36439y || i10 == a61Var.f36412n || i10 == a61Var.h || i10 == a61Var.f36436x) {
            return 0;
        }
        return i10 == a61Var.f36433w ? 8 : 3;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int size;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        org.telegram.ui.Components.t5 t5Var;
        int iKeyAt;
        int iValueAt;
        org.telegram.ui.Components.kx kxVar;
        int iMin;
        int i17;
        TLRPC.Document document;
        int i18;
        int i19;
        int i20;
        int size2;
        int i21;
        int i22;
        int i23;
        int size3;
        int i24;
        int i25;
        int size4;
        org.telegram.ui.Components.t5 t5Var2;
        TLRPC.Document document2;
        ImageReceiver imageReceiver;
        int i26;
        boolean zContains;
        int i27;
        int i28;
        int i29;
        org.telegram.ui.Components.t5 t5Var3;
        TLRPC.Document document3;
        ImageReceiver imageReceiver2;
        TLRPC.Document document4;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        org.telegram.ui.Components.kx kxVar2;
        ?? r10;
        boolean z11;
        String string;
        ig.q0 q0Var;
        a61 a61Var = this.f45028c;
        ArrayList arrayList = a61Var.C0;
        ArrayList arrayList2 = a61Var.G0;
        ArrayList arrayList3 = a61Var.B0;
        SparseIntArray sparseIntArray = a61Var.f36425s0;
        boolean z12 = a61Var.J0;
        ArrayList arrayList4 = a61Var.f36442z0;
        int i35 = a61Var.S;
        ArrayList arrayList5 = a61Var.I0;
        x41 x41Var = a61Var.f36392d0;
        HashSet hashSet = a61Var.G;
        ArrayList arrayList6 = a61Var.A0;
        int i36 = a61Var.R;
        int i37 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i37 == 8) {
            j51 j51Var = (j51) view;
            j51Var.f39258c = i10;
            j51Var.H = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = a61Var.Q1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        boolean z13 = false;
        if (i37 == 6) {
            TextView textView = (TextView) view;
            Integer num = a61Var.L0;
            if (num != null) {
                textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(num.intValue())));
                return;
            }
            return;
        }
        if (i37 == 0) {
            f51 f51Var = (f51) view;
            if (i10 == a61Var.f36436x) {
                f51Var.a(LocaleController.getString(R.string.SelectTopicIconHint), false);
                f51Var.f37942c.setVisibility(8);
                return;
            }
            if (i10 == a61Var.f36397f) {
                f51Var.a(LocaleController.getString(R.string.RecentlyUsed), false);
                f51Var.f37942c.setVisibility(8);
                return;
            }
            if (i10 == a61Var.f36439y) {
                f51Var.a(LocaleController.getString(R.string.StickerEffects), false);
                f51Var.f37942c.setVisibility(8);
                return;
            }
            f51Var.f37942c.setVisibility(8);
            if (i10 == a61Var.h) {
                f51Var.a(LocaleController.getString(R.string.PopularReactions), false);
                return;
            }
            if (i10 == a61Var.f36412n) {
                f51Var.a(LocaleController.getString(R.string.EmojiPackCollectibles), false);
                return;
            }
            int i38 = sparseIntArray.get(i10);
            if (i38 < 0) {
                f51Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.kx kxVar3 = (org.telegram.ui.Components.kx) arrayList5.get(i38);
            if (kxVar3.d != null) {
                MediaDataController.getInstance(i36).getStickerSet(kxVar3.d, false);
                kxVar3.d = null;
            }
            if (i35 != 5 && i35 != 7 && i35 != 6 && !kxVar3.f30207e && !UserConfig.getInstance(i36).isPremium()) {
                z13 = true;
            }
            f51Var.a(kxVar3.f30205b.title, z13);
            return;
        }
        if (i37 == 1) {
            j51 j51Var2 = (j51) view;
            j51Var2.f39258c = i10;
            ImageReceiver imageReceiver3 = j51Var2.f39261n;
            int i39 = a61Var.f36386b;
            if (i10 < i39 || i10 >= a61Var.f36389c) {
                int i40 = a61Var.A;
                q0Var = (i10 < i40 || i10 >= a61Var.B) ? (ig.q0) a61Var.D0.get(i10 - a61Var.d) : (ig.q0) a61Var.F0.get(i10 - i40);
            } else {
                q0Var = (ig.q0) a61Var.E0.get(i10 - i39);
            }
            if (i35 == 13) {
                j51Var2.f39257b = false;
                j51Var2.f39266y = true;
                j51Var2.f39265x = q0Var;
                j51Var2.setDrawable(Emoji.getEmojiDrawable(q0Var.f11412f));
                j51Var2.d(a61Var.F.contains(q0Var), false);
                return;
            }
            j51Var2.a(x41Var);
            j51Var2.f39266y = true;
            j51Var2.f39265x = q0Var;
            j51Var2.d(a61Var.F.contains(q0Var), false);
            j51Var2.f39257b = false;
            if (q0Var.f11409b || q0Var.f11412f == null) {
                j51Var2.f39263s = false;
                j51Var2.f39259e = new org.telegram.ui.Components.t5(q0Var.f11413g, (Paint.FontMetricsInt) null);
                j51Var2.d = null;
                j51Var2.h.clearImage();
                imageReceiver3.clearImage();
                Drawable drawableN = (Drawable) x41Var.Z2.get(j51Var2.f39259e.getDocumentId());
                if (drawableN == null) {
                    int cacheType = a61Var.getCacheType();
                    if (cacheType == 3 && q0Var.f11411e) {
                        cacheType = 27;
                    }
                    drawableN = org.telegram.ui.Components.k5.n(i36, j51Var2.f39259e.getDocumentId(), null, cacheType);
                    x41Var.Z2.put(j51Var2.f39259e.getDocumentId(), drawableN);
                }
                j51Var2.setDrawable(drawableN);
            } else {
                j51Var2.f39263s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i36).getReactionsMap().get(q0Var.f11412f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.g6.f23215m6, 0.2f);
                    if (LiteMode.isEnabled(8200)) {
                        ig.q0 q0Var2 = q0Var;
                        j51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", q0Var2, 0);
                        q0Var = q0Var2;
                    } else {
                        j51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                    }
                    MediaDataController.getInstance(i36).preloadImage(imageReceiver3, ImageLocation.getForDocument(tL_availableReaction.around_animation), ig.m0.a());
                } else {
                    j51Var2.h.clearImage();
                    imageReceiver3.clearImage();
                }
                j51Var2.f39259e = null;
                j51Var2.d = null;
                j51Var2.setDrawable(null);
                i51 i51Var = j51Var2.F;
                if (i51Var != null) {
                    i51Var.setVisibility(8);
                    j51Var2.F.setImageReceiver(null);
                }
            }
            if (!UserConfig.getInstance(i36).isPremium() && i35 == 14 && q0Var.f11409b && q0Var.d) {
                j51Var2.b();
                j51Var2.F.setVisibility(0);
                j51Var2.setEmojicon(null);
                return;
            }
            if (q0Var.f11411e) {
                j51Var2.setEmojicon(q0Var.f11412f);
            } else {
                j51Var2.setEmojicon(null);
            }
            i51 i51Var2 = j51Var2.F;
            if (i51Var2 != null) {
                i51Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i37 == 4) {
            e51 e51Var = (e51) view;
            int i41 = a61Var.f36429u0.get(i10);
            org.telegram.ui.Components.kx kxVar4 = (i41 < 0 || i41 >= arrayList5.size()) ? null : (org.telegram.ui.Components.kx) arrayList5.get(i41);
            if (i41 == -1) {
                a61Var.C = e51Var;
                e51Var.f37635a.setText("+" + ((arrayList4.size() - 40) + (z12 ? 1 : 0) + 1));
                return;
            }
            if (kxVar4 == null) {
                if (a61Var.C == e51Var) {
                    a61Var.C = null;
                    return;
                }
                return;
            } else {
                if (a61Var.C == e51Var) {
                    a61Var.C = null;
                }
                TextView textView2 = e51Var.f37635a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(kxVar4.f30206c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i37 == 5) {
            d51 d51Var = (d51) view;
            int i42 = a61Var.f36431v0.get(i10);
            if (i42 < 0 || i42 >= arrayList5.size() || (kxVar2 = (org.telegram.ui.Components.kx) arrayList5.get(i42)) == null) {
                return;
            }
            String str = kxVar2.f30205b.title;
            boolean z14 = (kxVar2.f30207e || UserConfig.getInstance(i36).isPremium()) ? false : true;
            boolean z15 = kxVar2.f30208f;
            gh.v2 v2Var = new gh.v2(this, kxVar2, i42, 18);
            ag.s1 s1Var = d51Var.f37269c;
            FrameLayout frameLayout = d51Var.f37267a;
            d51Var.d = str;
            if (z14) {
                frameLayout.setVisibility(8);
                r10 = 0;
                s1Var.setVisibility(0);
                s1Var.a(LocaleController.formatString("UnlockPremiumEmojiPack", R.string.UnlockPremiumEmojiPack, str), v2Var, false);
            } else {
                r10 = 0;
                s1Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(v2Var);
            }
            if (z15) {
                string = LocaleController.getString(R.string.Added);
                z11 = true;
            } else {
                int i43 = R.string.AddStickersCount;
                z11 = true;
                Object[] objArr = new Object[1];
                objArr[r10] = d51Var.d;
                string = LocaleController.formatString("AddStickersCount", i43, objArr);
            }
            d51Var.f37268b.c(string, r10, z11);
            frameLayout.setContentDescription(string);
            ValueAnimator valueAnimator2 = d51Var.f37270e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                d51Var.f37270e = null;
            }
            frameLayout.setEnabled(!z15);
            frameLayout.setAlpha(z15 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = d51Var.f37272n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                d51Var.f37272n = null;
            }
            Boolean bool = d51Var.h;
            if (bool == null || bool.booleanValue() != z14) {
                d51Var.h = Boolean.valueOf(z14);
                float f10 = z14 ? 1.0f : 0.0f;
                d51Var.f37271f = f10;
                frameLayout.setAlpha(1.0f - f10);
                s1Var.setAlpha(d51Var.f37271f);
                s1Var.setScaleX(d51Var.f37271f);
                s1Var.setScaleY(d51Var.f37271f);
                s1Var.setVisibility(d51Var.h.booleanValue() ? 0 : 8);
                return;
            }
            return;
        }
        if (i37 == 7 || i37 == 9) {
            return;
        }
        j51 j51Var3 = (j51) view;
        j51Var3.v = null;
        j51Var3.f39264w = null;
        j51Var3.f39256a = false;
        j51Var3.f39258c = i10;
        j51Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        if ((i35 == 4 && a61Var.M) || i35 == 6) {
            size = arrayList3.size();
        } else if (i35 == 4 || i35 == 3) {
            size = arrayList4.size();
        } else {
            size = 40;
            if (arrayList4.size() <= 40 || a61Var.f36440y0) {
                size = arrayList4.size() + (z12 ? 1 : 0);
            }
        }
        if (!z12) {
            if (i35 == 13) {
                if (a61Var.f36383a != -1) {
                    i30 = 1;
                } else {
                    i30 = 0;
                }
                i31 = i10 - i30;
                if (a61Var.v != -1) {
                    i32 = 1;
                } else {
                    i32 = 0;
                }
                if (i31 - i32 < arrayList.size()) {
                    if (a61Var.f36383a != -1) {
                        i33 = 1;
                    } else {
                        i33 = 0;
                    }
                    int i44 = i10 - i33;
                    if (a61Var.v != -1) {
                        i34 = 1;
                    } else {
                        i34 = 0;
                    }
                    String str2 = (String) arrayList.get((i44 - i34) - (z12 ? 1 : 0));
                    j51Var3.f39257b = false;
                    j51Var3.f39266y = false;
                    j51Var3.f39265x = ig.q0.b(str2);
                    j51Var3.setDrawable(Emoji.getEmojiDrawable(str2));
                    j51Var3.d(a61Var.F.contains(j51Var3.f39265x), false);
                    return;
                }
            }
            i11 = a61Var.f36383a;
            if (i11 != -1) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            i13 = i10 - i12;
            i14 = a61Var.v;
            if (i14 != -1) {
                i15 = 1;
            } else {
                i15 = 0;
            }
            if (i13 - i15 < size) {
                if (i11 != -1) {
                    i27 = 1;
                } else {
                    i27 = 0;
                }
                int i45 = i10 - i27;
                if (i14 != -1) {
                    i28 = 1;
                } else {
                    i28 = 0;
                }
                i29 = (i45 - i28) - (z12 ? 1 : 0);
                if (i35 != 4 && a61Var.M) {
                    j51Var3.c((TLRPC.Document) arrayList3.get(i29), x41Var);
                } else if (i35 == 6) {
                    document4 = (TLRPC.Document) arrayList3.get(i29);
                    j51Var3.c(document4, x41Var);
                    if (document4 == null && hashSet.contains(Long.valueOf(document4.f22386id))) {
                        z10 = true;
                    }
                } else {
                    t5Var3 = (org.telegram.ui.Components.t5) arrayList4.get(i29);
                    j51Var3.f39259e = t5Var3;
                    if (t5Var3 == null) {
                        document3 = null;
                    } else {
                        document3 = t5Var3.document;
                    }
                    j51Var3.d = document3;
                    if (t5Var3 == null && hashSet.contains(Long.valueOf(t5Var3.getDocumentId()))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j51Var3.M = false;
                    imageReceiver2 = j51Var3.h;
                    if (imageReceiver2 != null) {
                        imageReceiver2.clearImage();
                    }
                }
                z10 = false;
            } else if (!arrayList6.isEmpty() && (i26 = i10 - a61Var.f36421r) >= 0 && i26 < arrayList6.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i10 - a61Var.f36421r);
                TLRPC.Document document5 = tL_starGiftUnique.getDocument();
                j51Var3.f39259e = new org.telegram.ui.Components.t5(document5, (Paint.FontMetricsInt) null);
                j51Var3.d = document5;
                j51Var3.v = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) hh.u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    j51Var3.f39264w = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = j51Var3.f39259e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.f22607id));
                j51Var3.M = false;
                ImageReceiver imageReceiver4 = j51Var3.h;
                if (imageReceiver4 != null) {
                    imageReceiver4.clearImage();
                }
            } else if (arrayList2.isEmpty()) {
                while (i16 < sparseIntArray.size()) {
                    iKeyAt = sparseIntArray.keyAt(i16);
                    iValueAt = sparseIntArray.valueAt(i16);
                    if (iValueAt >= 0) {
                        kxVar = (org.telegram.ui.Components.kx) arrayList5.get(iValueAt);
                    } else {
                        kxVar = null;
                    }
                    if (kxVar != null) {
                        if (kxVar.h) {
                            iMin = kxVar.f30206c.size();
                        } else {
                            iMin = Math.min(kxVar.f30206c.size(), 24);
                        }
                        i17 = (i10 - iKeyAt) - 1;
                        if (i17 < 0 && i17 < iMin && (document = (TLRPC.Document) kxVar.f30206c.get(i17)) != null) {
                            if (a61Var.M) {
                                j51Var3.c(document, a61Var.f36395e0);
                            } else {
                                j51Var3.M = false;
                                ImageReceiver imageReceiver5 = j51Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.clearImage();
                                }
                                j51Var3.f39259e = new org.telegram.ui.Components.t5(document, (Paint.FontMetricsInt) null);
                            }
                            j51Var3.d = document;
                        }
                    }
                }
                z10 = true;
                t5Var = j51Var3.f39259e;
                if (t5Var != null || !hashSet.contains(Long.valueOf(t5Var.getDocumentId()))) {
                    z10 = false;
                }
            } else {
                if (a61Var.f36383a != -1) {
                    i18 = 1;
                } else {
                    i18 = 0;
                }
                int i46 = i10 - i18;
                if (a61Var.v != -1) {
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                i20 = ((i46 - i19) - size) - 1;
                if (arrayList6.isEmpty()) {
                    size2 = 0;
                } else {
                    size2 = arrayList6.size() + 1;
                }
                if (i20 - size2 < 0) {
                    while (i16 < sparseIntArray.size()) {
                        iKeyAt = sparseIntArray.keyAt(i16);
                        iValueAt = sparseIntArray.valueAt(i16);
                        if (iValueAt >= 0) {
                            kxVar = (org.telegram.ui.Components.kx) arrayList5.get(iValueAt);
                        } else {
                            kxVar = null;
                        }
                        if (kxVar != null) {
                            if (kxVar.h) {
                                iMin = kxVar.f30206c.size();
                            } else {
                                iMin = Math.min(kxVar.f30206c.size(), 24);
                            }
                            i17 = (i10 - iKeyAt) - 1;
                            if (i17 < 0) {
                            }
                        }
                    }
                    z10 = true;
                    t5Var = j51Var3.f39259e;
                    if (t5Var != null) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                } else {
                    if (a61Var.f36383a != -1) {
                        i21 = 1;
                    } else {
                        i21 = 0;
                    }
                    int i47 = i10 - i21;
                    if (a61Var.v != -1) {
                        i22 = 1;
                    } else {
                        i22 = 0;
                    }
                    i23 = ((i47 - i22) - size) - 1;
                    if (arrayList6.isEmpty()) {
                        size3 = 0;
                    } else {
                        size3 = arrayList6.size() + 1;
                    }
                    if (i23 - size3 < arrayList2.size()) {
                        if (a61Var.f36383a != -1) {
                            i24 = 1;
                        } else {
                            i24 = 0;
                        }
                        int i48 = i10 - i24;
                        if (a61Var.v != -1) {
                            i25 = 1;
                        } else {
                            i25 = 0;
                        }
                        int i49 = ((i48 - i25) - size) - 1;
                        if (arrayList6.isEmpty()) {
                            size4 = 0;
                        } else {
                            size4 = arrayList6.size() + 1;
                        }
                        t5Var2 = (org.telegram.ui.Components.t5) arrayList2.get(i49 - size4);
                        j51Var3.f39259e = t5Var2;
                        if (t5Var2 == null) {
                            document2 = null;
                        } else {
                            document2 = t5Var2.document;
                        }
                        j51Var3.d = document2;
                        if (t5Var2 == null && hashSet.contains(Long.valueOf(t5Var2.getDocumentId()))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j51Var3.M = false;
                        imageReceiver = j51Var3.h;
                        if (imageReceiver != null) {
                            imageReceiver.clearImage();
                        }
                    } else {
                        while (i16 < sparseIntArray.size()) {
                            iKeyAt = sparseIntArray.keyAt(i16);
                            iValueAt = sparseIntArray.valueAt(i16);
                            if (iValueAt >= 0) {
                                kxVar = (org.telegram.ui.Components.kx) arrayList5.get(iValueAt);
                            } else {
                                kxVar = null;
                            }
                            if (kxVar != null) {
                                if (kxVar.h) {
                                    iMin = kxVar.f30206c.size();
                                } else {
                                    iMin = Math.min(kxVar.f30206c.size(), 24);
                                }
                                i17 = (i10 - iKeyAt) - 1;
                                if (i17 < 0) {
                                }
                            }
                        }
                        z10 = true;
                        t5Var = j51Var3.f39259e;
                        if (t5Var != null) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                    }
                }
            }
            zContains = z10;
        } else if (i10 == (a61Var.f36383a != -1 ? 1 : 0) + (a61Var.v != -1 ? 1 : 0)) {
            zContains = hashSet.contains(null);
            j51Var3.f39256a = true;
            j51Var3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
            j51Var3.f39259e = null;
            j51Var3.d = null;
            j51Var3.M = false;
            ImageReceiver imageReceiver6 = j51Var3.h;
            if (imageReceiver6 != null) {
                imageReceiver6.clearImage();
            }
        } else {
            if (i35 == 13) {
                if (a61Var.f36383a != -1) {
                    i30 = 1;
                } else {
                    i30 = 0;
                }
                i31 = i10 - i30;
                if (a61Var.v != -1) {
                    i32 = 1;
                } else {
                    i32 = 0;
                }
                if (i31 - i32 < arrayList.size()) {
                    if (a61Var.f36383a != -1) {
                        i33 = 1;
                    } else {
                        i33 = 0;
                    }
                    int i410 = i10 - i33;
                    if (a61Var.v != -1) {
                        i34 = 1;
                    } else {
                        i34 = 0;
                    }
                    String str3 = (String) arrayList.get((i410 - i34) - (z12 ? 1 : 0));
                    j51Var3.f39257b = false;
                    j51Var3.f39266y = false;
                    j51Var3.f39265x = ig.q0.b(str3);
                    j51Var3.setDrawable(Emoji.getEmojiDrawable(str3));
                    j51Var3.d(a61Var.F.contains(j51Var3.f39265x), false);
                    return;
                }
            }
            i11 = a61Var.f36383a;
            if (i11 != -1) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            i13 = i10 - i12;
            i14 = a61Var.v;
            if (i14 != -1) {
                i15 = 1;
            } else {
                i15 = 0;
            }
            if (i13 - i15 < size) {
                if (i11 != -1) {
                    i27 = 1;
                } else {
                    i27 = 0;
                }
                int i411 = i10 - i27;
                if (i14 != -1) {
                    i28 = 1;
                } else {
                    i28 = 0;
                }
                i29 = (i411 - i28) - (z12 ? 1 : 0);
                if (i35 != 4) {
                    if (i35 == 6) {
                        document4 = (TLRPC.Document) arrayList3.get(i29);
                        j51Var3.c(document4, x41Var);
                        if (document4 == null) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                    } else {
                        t5Var3 = (org.telegram.ui.Components.t5) arrayList4.get(i29);
                        j51Var3.f39259e = t5Var3;
                        if (t5Var3 == null) {
                            document3 = null;
                        } else {
                            document3 = t5Var3.document;
                        }
                        j51Var3.d = document3;
                        if (t5Var3 == null) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        j51Var3.M = false;
                        imageReceiver2 = j51Var3.h;
                        if (imageReceiver2 != null) {
                            imageReceiver2.clearImage();
                        }
                    }
                } else if (i35 == 6) {
                    document4 = (TLRPC.Document) arrayList3.get(i29);
                    j51Var3.c(document4, x41Var);
                    if (document4 == null) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                } else {
                    t5Var3 = (org.telegram.ui.Components.t5) arrayList4.get(i29);
                    j51Var3.f39259e = t5Var3;
                    if (t5Var3 == null) {
                        document3 = null;
                    } else {
                        document3 = t5Var3.document;
                    }
                    j51Var3.d = document3;
                    if (t5Var3 == null) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    j51Var3.M = false;
                    imageReceiver2 = j51Var3.h;
                    if (imageReceiver2 != null) {
                        imageReceiver2.clearImage();
                    }
                }
            } else if (!arrayList6.isEmpty()) {
                if (arrayList2.isEmpty()) {
                    for (i16 = 0; i16 < sparseIntArray.size(); i16++) {
                        iKeyAt = sparseIntArray.keyAt(i16);
                        iValueAt = sparseIntArray.valueAt(i16);
                        if (iValueAt >= 0) {
                            kxVar = (org.telegram.ui.Components.kx) arrayList5.get(iValueAt);
                        } else {
                            kxVar = null;
                        }
                        if (kxVar != null) {
                            if (kxVar.h) {
                                iMin = kxVar.f30206c.size();
                            } else {
                                iMin = Math.min(kxVar.f30206c.size(), 24);
                            }
                            i17 = (i10 - iKeyAt) - 1;
                            if (i17 < 0) {
                            }
                        }
                    }
                    z10 = true;
                    t5Var = j51Var3.f39259e;
                    if (t5Var != null) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                } else {
                    if (a61Var.f36383a != -1) {
                        i18 = 1;
                    } else {
                        i18 = 0;
                    }
                    int i412 = i10 - i18;
                    if (a61Var.v != -1) {
                        i19 = 1;
                    } else {
                        i19 = 0;
                    }
                    i20 = ((i412 - i19) - size) - 1;
                    if (arrayList6.isEmpty()) {
                        size2 = 0;
                    } else {
                        size2 = arrayList6.size() + 1;
                    }
                    if (i20 - size2 < 0) {
                        while (i16 < sparseIntArray.size()) {
                            iKeyAt = sparseIntArray.keyAt(i16);
                            iValueAt = sparseIntArray.valueAt(i16);
                            if (iValueAt >= 0) {
                                kxVar = (org.telegram.ui.Components.kx) arrayList5.get(iValueAt);
                            } else {
                                kxVar = null;
                            }
                            if (kxVar != null) {
                                if (kxVar.h) {
                                    iMin = kxVar.f30206c.size();
                                } else {
                                    iMin = Math.min(kxVar.f30206c.size(), 24);
                                }
                                i17 = (i10 - iKeyAt) - 1;
                                if (i17 < 0) {
                                }
                            }
                        }
                        z10 = true;
                        t5Var = j51Var3.f39259e;
                        if (t5Var != null) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                    } else {
                        if (a61Var.f36383a != -1) {
                            i21 = 1;
                        } else {
                            i21 = 0;
                        }
                        int i413 = i10 - i21;
                        if (a61Var.v != -1) {
                            i22 = 1;
                        } else {
                            i22 = 0;
                        }
                        i23 = ((i413 - i22) - size) - 1;
                        if (arrayList6.isEmpty()) {
                            size3 = 0;
                        } else {
                            size3 = arrayList6.size() + 1;
                        }
                        if (i23 - size3 < arrayList2.size()) {
                            if (a61Var.f36383a != -1) {
                                i24 = 1;
                            } else {
                                i24 = 0;
                            }
                            int i414 = i10 - i24;
                            if (a61Var.v != -1) {
                                i25 = 1;
                            } else {
                                i25 = 0;
                            }
                            int i415 = ((i414 - i25) - size) - 1;
                            if (arrayList6.isEmpty()) {
                                size4 = 0;
                            } else {
                                size4 = arrayList6.size() + 1;
                            }
                            t5Var2 = (org.telegram.ui.Components.t5) arrayList2.get(i415 - size4);
                            j51Var3.f39259e = t5Var2;
                            if (t5Var2 == null) {
                                document2 = null;
                            } else {
                                document2 = t5Var2.document;
                            }
                            j51Var3.d = document2;
                            if (t5Var2 == null) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            j51Var3.M = false;
                            imageReceiver = j51Var3.h;
                            if (imageReceiver != null) {
                                imageReceiver.clearImage();
                            }
                        } else {
                            while (i16 < sparseIntArray.size()) {
                                iKeyAt = sparseIntArray.keyAt(i16);
                                iValueAt = sparseIntArray.valueAt(i16);
                                if (iValueAt >= 0) {
                                    kxVar = (org.telegram.ui.Components.kx) arrayList5.get(iValueAt);
                                } else {
                                    kxVar = null;
                                }
                                if (kxVar != null) {
                                    if (kxVar.h) {
                                        iMin = kxVar.f30206c.size();
                                    } else {
                                        iMin = Math.min(kxVar.f30206c.size(), 24);
                                    }
                                    i17 = (i10 - iKeyAt) - 1;
                                    if (i17 < 0) {
                                    }
                                }
                            }
                            z10 = true;
                            t5Var = j51Var3.f39259e;
                            if (t5Var != null) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                        }
                    }
                }
            } else if (arrayList2.isEmpty()) {
                while (i16 < sparseIntArray.size()) {
                    iKeyAt = sparseIntArray.keyAt(i16);
                    iValueAt = sparseIntArray.valueAt(i16);
                    if (iValueAt >= 0) {
                        kxVar = (org.telegram.ui.Components.kx) arrayList5.get(iValueAt);
                    } else {
                        kxVar = null;
                    }
                    if (kxVar != null) {
                        if (kxVar.h) {
                            iMin = kxVar.f30206c.size();
                        } else {
                            iMin = Math.min(kxVar.f30206c.size(), 24);
                        }
                        i17 = (i10 - iKeyAt) - 1;
                        if (i17 < 0) {
                        }
                    }
                }
                z10 = true;
                t5Var = j51Var3.f39259e;
                if (t5Var != null) {
                    z10 = false;
                } else {
                    z10 = false;
                }
            } else {
                if (a61Var.f36383a != -1) {
                    i18 = 1;
                } else {
                    i18 = 0;
                }
                int i416 = i10 - i18;
                if (a61Var.v != -1) {
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                i20 = ((i416 - i19) - size) - 1;
                if (arrayList6.isEmpty()) {
                    size2 = 0;
                } else {
                    size2 = arrayList6.size() + 1;
                }
                if (i20 - size2 < 0) {
                    while (i16 < sparseIntArray.size()) {
                        iKeyAt = sparseIntArray.keyAt(i16);
                        iValueAt = sparseIntArray.valueAt(i16);
                        if (iValueAt >= 0) {
                            kxVar = (org.telegram.ui.Components.kx) arrayList5.get(iValueAt);
                        } else {
                            kxVar = null;
                        }
                        if (kxVar != null) {
                            if (kxVar.h) {
                                iMin = kxVar.f30206c.size();
                            } else {
                                iMin = Math.min(kxVar.f30206c.size(), 24);
                            }
                            i17 = (i10 - iKeyAt) - 1;
                            if (i17 < 0) {
                            }
                        }
                    }
                    z10 = true;
                    t5Var = j51Var3.f39259e;
                    if (t5Var != null) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                } else {
                    if (a61Var.f36383a != -1) {
                        i21 = 1;
                    } else {
                        i21 = 0;
                    }
                    int i417 = i10 - i21;
                    if (a61Var.v != -1) {
                        i22 = 1;
                    } else {
                        i22 = 0;
                    }
                    i23 = ((i417 - i22) - size) - 1;
                    if (arrayList6.isEmpty()) {
                        size3 = 0;
                    } else {
                        size3 = arrayList6.size() + 1;
                    }
                    if (i23 - size3 < arrayList2.size()) {
                        if (a61Var.f36383a != -1) {
                            i24 = 1;
                        } else {
                            i24 = 0;
                        }
                        int i418 = i10 - i24;
                        if (a61Var.v != -1) {
                            i25 = 1;
                        } else {
                            i25 = 0;
                        }
                        int i419 = ((i418 - i25) - size) - 1;
                        if (arrayList6.isEmpty()) {
                            size4 = 0;
                        } else {
                            size4 = arrayList6.size() + 1;
                        }
                        t5Var2 = (org.telegram.ui.Components.t5) arrayList2.get(i419 - size4);
                        j51Var3.f39259e = t5Var2;
                        if (t5Var2 == null) {
                            document2 = null;
                        } else {
                            document2 = t5Var2.document;
                        }
                        j51Var3.d = document2;
                        if (t5Var2 == null) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        j51Var3.M = false;
                        imageReceiver = j51Var3.h;
                        if (imageReceiver != null) {
                            imageReceiver.clearImage();
                        }
                    } else {
                        while (i16 < sparseIntArray.size()) {
                            iKeyAt = sparseIntArray.keyAt(i16);
                            iValueAt = sparseIntArray.valueAt(i16);
                            if (iValueAt >= 0) {
                                kxVar = (org.telegram.ui.Components.kx) arrayList5.get(iValueAt);
                            } else {
                                kxVar = null;
                            }
                            if (kxVar != null) {
                                if (kxVar.h) {
                                    iMin = kxVar.f30206c.size();
                                } else {
                                    iMin = Math.min(kxVar.f30206c.size(), 24);
                                }
                                i17 = (i10 - iKeyAt) - 1;
                                if (i17 < 0) {
                                }
                            }
                        }
                        z10 = true;
                        t5Var = j51Var3.f39259e;
                        if (t5Var != null) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                    }
                }
            }
            zContains = z10;
        }
        org.telegram.ui.Components.t5 t5Var4 = j51Var3.f39259e;
        if (t5Var4 != null) {
            org.telegram.ui.Components.k5 k5VarM = (org.telegram.ui.Components.k5) x41Var.Z2.get(t5Var4.getDocumentId());
            if (k5VarM == null) {
                k5VarM = j51Var3.f39259e.document != null ? org.telegram.ui.Components.k5.m(i36, a61Var.getCacheType(), j51Var3.f39259e.document) : org.telegram.ui.Components.k5.n(i36, j51Var3.f39259e.getDocumentId(), null, a61Var.getCacheType());
                x41Var.Z2.put(j51Var3.f39259e.getDocumentId(), k5VarM);
            }
            j51Var3.setDrawable(k5VarM);
        } else {
            j51Var3.setDrawable(null);
        }
        j51Var3.d(zContains, false);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View j51Var;
        a61 a61Var = this.f45028c;
        int i11 = a61Var.S;
        org.telegram.ui.ActionBar.c6 c6Var = a61Var.V0;
        if (i10 == 0) {
            j51Var = new f51(a61Var, a61Var.getContext(), i11 == 6);
        } else if (i10 == 2) {
            j51Var = new ImageView(a61Var.getContext());
        } else if (i10 == 3 || i10 == 1 || i10 == 8) {
            j51 j51Var2 = new j51(a61Var, a61Var.getContext());
            if (i10 == 8) {
                j51Var2.M = true;
                ImageReceiver imageReceiver = new ImageReceiver(j51Var2);
                j51Var2.h = imageReceiver;
                j51Var2.f39262r = imageReceiver;
                imageReceiver.setImageBitmap(a61Var.J);
                a61Var.K = j51Var2;
                j51Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            j51Var = j51Var2;
        } else if (i10 == 4) {
            Context context = a61Var.getContext();
            e51 e51Var = new e51(context);
            TextView textView = new TextView(context);
            e51Var.f37635a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(11.0f), a61Var.f36391c1 ? org.telegram.ui.ActionBar.g6.v(a61Var.f36388b1, org.telegram.ui.ActionBar.g6.l1(0.4f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false))) : i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Te, false), 99)));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            e51Var.addView(textView, h7.z5.e(-2, -2, 17));
            j51Var = e51Var;
        } else if (i10 == 5) {
            d51 d51Var = new d51(a61Var.getContext());
            org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(d51Var.getContext(), false, false, false, 4);
            d51Var.f37268b = r3Var;
            r3Var.b(0.3f, 250L, org.telegram.ui.Components.er.h);
            r3Var.setTextSize(AndroidUtilities.dp(14.0f));
            r3Var.setTypeface(AndroidUtilities.bold());
            r3Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
            r3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(d51Var.getContext());
            d51Var.f37267a = frameLayout;
            frameLayout.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
            frameLayout.addView(r3Var, h7.z5.e(-1, -2, 17));
            d51Var.addView(frameLayout, h7.z5.c(-1.0f, -1));
            ag.s1 s1Var = new ag.s1(d51Var.getContext(), c6Var, false);
            d51Var.f37269c = s1Var;
            s1Var.setIcon(R.raw.unlock_icon);
            d51Var.addView(s1Var, h7.z5.c(-1.0f, -1));
            j51Var = d51Var;
        } else if (i10 == 6) {
            qd0 qd0Var = new qd0(a61Var.getContext(), 3);
            qd0Var.setTextSize(1, 13.0f);
            if (i11 == 3) {
                qd0Var.setText(LocaleController.getString(R.string.SelectTopicIconHint));
            } else if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                qd0Var.setText(LocaleController.getString(R.string.EmojiLongtapHint));
            } else {
                qd0Var.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
            }
            qd0Var.setGravity(17);
            qd0Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var));
            j51Var = qd0Var;
        } else if (i10 == 7) {
            org.telegram.ui.Cells.q3 q3Var = new org.telegram.ui.Cells.q3(a61Var.getContext(), 52);
            q3Var.setTag("searchbox");
            j51Var = q3Var;
        } else {
            j51Var = new j51(a61Var, a61Var.getContext());
        }
        if (a61.c(a61Var)) {
            j51Var.setScaleX(0.0f);
            j51Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.lk0(j51Var);
    }
}
