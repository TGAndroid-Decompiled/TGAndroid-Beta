package th;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.b8;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.m31;
public final class y2 {
    public TL_stories.StoryItem f49661a = null;
    public d5 f49662b = null;
    public TL_stories.StoryItem f49663c;
    public boolean d;
    public boolean e;
    public boolean f49664f;
    public boolean f49665g;
    public CharSequence h;
    public e6 f49666i;
    public e6 f49667j;
    public final z2 f49668k;

    public y2(z2 z2Var) {
        this.f49668k = z2Var;
    }

    public static String c(y2 y2Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = y2Var.f49661a;
        if (storyItem != null && (messageMedia = storyItem.media) != null) {
            if (messageMedia.photo != null) {
                StringBuilder sb2 = new StringBuilder("photo#");
                sb2.append(y2Var.f49661a.media.photo.f19817id);
                sb2.append("at");
                return a1.g.p(sb2, y2Var.f49661a.media.photo.dc_id, "dc");
            } else if (messageMedia.document != null) {
                StringBuilder sb3 = new StringBuilder("doc#");
                sb3.append(y2Var.f49661a.media.document.f19799id);
                sb3.append("at");
                return a1.g.p(sb3, y2Var.f49661a.media.document.dc_id, "dc");
            } else {
                return "unknown";
            }
        } else if (y2Var.f49662b != null) {
            return "uploading from " + y2Var.f49662b.e;
        } else {
            return "unknown";
        }
    }

    public final boolean d() {
        d5 d5Var = this.f49662b;
        if (d5Var != null) {
            return d5Var.f48878c.H0;
        }
        TL_stories.StoryItem storyItem = this.f49661a;
        if (storyItem != null) {
            if (storyItem.noforwards) {
                return false;
            }
            if (storyItem.pinned) {
                TLRPC.Chat L0 = vp.r1(this.f49668k.f49730l2).L0(Long.valueOf(-storyItem.dialogId));
                if (L0 != null && L0.noforwards) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final String e() {
        z2 z2Var = this.f49668k;
        if (z2Var.f49776x1.f49661a == null) {
            return null;
        }
        if (z2Var.f49726k1 > 0) {
            TLRPC.User Z1 = vp.r1(z2Var.f49730l2).Z1(Long.valueOf(z2Var.f49726k1));
            if (h20.n(Z1) == null) {
                return null;
            }
            if (z2Var.f49776x1.f49664f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", h20.n(Z1));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", h20.n(Z1), Integer.valueOf(z2Var.f49776x1.f49661a.f20031id));
        }
        TLRPC.Chat L0 = vp.r1(z2Var.f49730l2).L0(Long.valueOf(-z2Var.f49726k1));
        if (org.telegram.messenger.w3.K(L0, false) == null) {
            return null;
        }
        if (z2Var.f49776x1.f49664f) {
            return String.format(Locale.US, "https://t.me/%1$s/s/live", org.telegram.messenger.w3.K(L0, false));
        }
        return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", org.telegram.messenger.w3.K(L0, false), Integer.valueOf(z2Var.f49776x1.f49661a.f20031id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.f49661a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final e6 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.f49666i == null && (storyItem = this.f49661a) != null) {
            TLRPC.Document document = storyItem.music;
            e6 e6Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) org.telegram.messenger.i0.V(TLRPC.TL_documentAttributeAudio.class, document.attributes)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    e6Var = new e6();
                    e6Var.f48930f = true;
                    e6Var.f48931g = document;
                    if (TextUtils.isEmpty(str)) {
                        e6Var.f48934k = new SpannableStringBuilder(e6.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        e6Var.f48934k = new SpannableStringBuilder(e6.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(e6.d()).append((CharSequence) " ").append((CharSequence) str2);
                        e6Var.f48934k = append;
                        int length = append.length();
                        e6Var.f48934k.append((CharSequence) " ・ ");
                        e6Var.f48934k.setSpan(new CharacterStyle(), length, e6Var.f48934k.length(), 33);
                        e6Var.f48934k.append((CharSequence) str);
                    }
                }
            }
            this.f49666i = e6Var;
        }
        return this.f49666i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.f49661a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            z2 z2Var = this.f49668k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                b8.G(z2Var.f49730l2);
                return b8.I(this.f49661a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.f49661a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize w9 = b8.w(photo.sizes, Integer.MAX_VALUE, false, null, false);
                b8.G(z2Var.f49730l2);
                File K = b8.K(w9, null, true, true);
                if (!K.exists()) {
                    b8.G(z2Var.f49730l2);
                    return b8.K(w9, null, false, true);
                }
                return K;
            }
        }
        return null;
    }

    public final e6 i() {
        ArrayList arrayList;
        TLRPC.Chat L0;
        CharSequence n22;
        TLRPC.Chat L02;
        CharSequence n23;
        CharSequence n24;
        String str;
        if (this.f49667j == null) {
            TL_stories.StoryItem storyItem = this.f49661a;
            int i10 = 0;
            e6 e6Var = null;
            if (storyItem != null) {
                int i11 = this.f49668k.f49730l2;
                if (storyItem.fwd_from != null) {
                    e6Var = new e6();
                    e6Var.f48927a = i11;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long o10 = org.telegram.messenger.o5.o(peer);
                        e6Var.f48928b = Long.valueOf(o10);
                        if (o10 >= 0) {
                            e6Var.f48934k = new SpannableStringBuilder(jj.f6()).append((CharSequence) " ").append((CharSequence) h20.p(vp.r1(i11).Z1(Long.valueOf(o10))));
                        } else {
                            TLRPC.Chat L03 = vp.r1(i11).L0(Long.valueOf(-o10));
                            if (org.telegram.messenger.w3.V(L03)) {
                                n24 = jj.F();
                            } else {
                                n24 = jj.n2();
                            }
                            SpannableStringBuilder append = new SpannableStringBuilder(n24).append((CharSequence) " ");
                            if (L03 != null) {
                                str = L03.title;
                            } else {
                                str = "";
                            }
                            e6Var.f48934k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        e6Var.f48934k = new SpannableStringBuilder(jj.f6()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    e6Var.f48930f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        e6Var.f48929c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    e6Var.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (i10 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(i10);
                        }
                        i10++;
                    }
                    if (tL_mediaAreaChannelPost != null && (L02 = vp.r1(i11).L0(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        e6Var = new e6();
                        e6Var.f48928b = Long.valueOf(-L02.f19793id);
                        e6Var.e = true;
                        e6Var.f48927a = i11;
                        e6Var.f48930f = true;
                        e6Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (org.telegram.messenger.w3.V(L02)) {
                            n23 = jj.F();
                        } else {
                            n23 = jj.n2();
                        }
                        e6Var.f48934k = new SpannableStringBuilder(n23).append((CharSequence) " ").append((CharSequence) L02.title);
                    }
                }
                this.f49667j = e6Var;
            } else {
                d5 d5Var = this.f49662b;
                if (d5Var != null) {
                    vh.n5 n5Var = d5Var.f48878c;
                    if (n5Var != null) {
                        if (n5Var.f51541n) {
                            e6Var = new e6();
                            e6Var.f48934k = n5Var.f51545p;
                            String str2 = n5Var.f51551s;
                            e6Var.f48935l = str2;
                            e6Var.f48930f = TextUtils.isEmpty(str2);
                        } else if (n5Var.f51555u && (arrayList = n5Var.v) != null && arrayList.size() > 0) {
                            jj jjVar = (jj) n5Var.v.get(0);
                            long p5 = vh.n5.p(jjVar);
                            if (p5 < 0 && (L0 = vp.r1(jjVar.I1).L0(Long.valueOf(-p5))) != null) {
                                e6Var = new e6();
                                e6Var.f48928b = Long.valueOf(p5);
                                e6Var.e = true;
                                e6Var.f48927a = jjVar.I1;
                                e6Var.f48930f = true;
                                Boolean D = vh.n5.D(jjVar);
                                if (D != null) {
                                    if (D.booleanValue()) {
                                        i10 = jjVar.f16337k.fwd_from.channel_post;
                                    } else {
                                        i10 = jjVar.f1();
                                    }
                                }
                                e6Var.d = Integer.valueOf(i10);
                                if (org.telegram.messenger.w3.V(L0)) {
                                    n22 = jj.F();
                                } else {
                                    n22 = jj.n2();
                                }
                                e6Var.f48934k = new SpannableStringBuilder(n22).append((CharSequence) " ").append((CharSequence) L0.title);
                            }
                        }
                    }
                    this.f49667j = e6Var;
                }
            }
        }
        return this.f49667j;
    }

    public final boolean j() {
        d5 d5Var;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.f49661a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }
        if (this.f49662b == null) {
            return true;
        }
        return !d5Var.f48878c.Y;
    }

    public final boolean k(long j10) {
        TL_stories.StoryItem storyItem = this.f49661a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j10 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.f19810id) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean l() {
        return this.e;
    }

    public final boolean m() {
        String str;
        TLRPC.MessageMedia messageMedia;
        d5 d5Var = this.f49662b;
        if (d5Var != null) {
            return d5Var.f48882s;
        }
        TL_stories.StoryItem storyItem = this.f49661a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.f49661a.media.getDocument();
            if (!jj.K4(document) && !"video/mp4".equals(document.mime_type)) {
                return false;
            }
            return true;
        }
        TL_stories.StoryItem storyItem2 = this.f49661a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        this.f49661a = storyItem;
        this.f49667j = null;
        this.f49666i = null;
        this.f49662b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.e = m();
        TL_stories.StoryItem storyItem2 = this.f49661a;
        if (storyItem2 != null && (messageMedia = storyItem2.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49664f = z10;
    }

    public final void o() {
        SpannableStringBuilder valueOf;
        int i10 = 0;
        this.f49665g = false;
        z2 z2Var = this.f49668k;
        k2 k2Var = z2Var.f49759t0;
        y2 y2Var = z2Var.f49776x1;
        d5 d5Var = y2Var.f49662b;
        if (d5Var != null) {
            CharSequence charSequence = d5Var.f48878c.C0;
            this.h = charSequence;
            CharSequence m10 = org.telegram.messenger.k6.m(charSequence, k2Var.f49113b0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m10;
            if (m10 == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(m10);
            }
            TLRPC.User Z1 = vp.r1(z2Var.f49730l2).Z1(Long.valueOf(z2Var.f49726k1));
            if (z2Var.f49726k1 < 0 || vp.r1(z2Var.f49730l2).V4(Z1)) {
                jj.d(valueOf, true);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = y2Var.f49661a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, m31.M0())) {
                this.f49665g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = y2Var.f49661a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence m11 = org.telegram.messenger.k6.m(str, k2Var.f49113b0.getPaint().getFontMetricsInt(), false, null, 0);
                this.h = m11;
                if (m11 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(jj.A5(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, k2Var.f49113b0.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(org.telegram.messenger.k6.m(valueOf2, k2Var.f49113b0.getPaint().getFontMetricsInt(), false, null, 0));
                    TLRPC.User Z12 = vp.r1(z2Var.f49730l2).Z1(Long.valueOf(z2Var.f49726k1));
                    if (z2Var.f49726k1 < 0 || vp.r1(z2Var.f49730l2).V4(Z12)) {
                        i10 = 1;
                    }
                    if (i10 != 0) {
                        jj.d(valueOf2, true);
                    }
                    jj.b(valueOf2, tL_textWithEntities.entities, false, true, true, false, i10 ^ 1);
                    this.h = valueOf2;
                    return;
                }
                return;
            }
            String str2 = y2Var.f49661a.caption;
            this.h = str2;
            CharSequence m12 = org.telegram.messenger.k6.m(str2, k2Var.f49113b0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m12;
            if (m12 != null && y2Var.f49661a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(jj.A5(new SpannableStringBuilder(y2Var.f49661a.caption), y2Var.f49661a.entities, k2Var.f49113b0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(org.telegram.messenger.k6.m(valueOf3, k2Var.f49113b0.getPaint().getFontMetricsInt(), false, null, 0));
                TLRPC.User Z13 = vp.r1(z2Var.f49730l2).Z1(Long.valueOf(z2Var.f49726k1));
                if (z2Var.f49726k1 < 0 || vp.r1(z2Var.f49730l2).V4(Z13)) {
                    i10 = 1;
                }
                if (i10 != 0) {
                    jj.d(valueOf3, true);
                }
                jj.b(valueOf3, y2Var.f49661a.entities, false, true, true, false, i10 ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
