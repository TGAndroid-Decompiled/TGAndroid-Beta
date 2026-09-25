package zg;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q5;
public final class o0 {
    public boolean f49394a;
    public boolean f49395b;
    public long f49396c;
    public boolean d;
    public boolean e;
    public String f49397f;
    public long f49398g;
    public long h;

    public static o0 b(String str) {
        if (str == null) {
            str = "";
        }
        ?? obj = new Object();
        if (str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                obj.f49398g = parseLong;
                obj.h = parseLong;
                return obj;
            } catch (Exception unused) {
                obj.f49397f = str;
                obj.h = str.hashCode();
                return obj;
            }
        }
        obj.f49397f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static o0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        ?? obj = new Object();
        String str = tL_availableReaction.reaction;
        obj.f49397f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static o0 d(TLRPC.Reaction reaction) {
        ?? obj = new Object();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            obj.f49394a = true;
            return obj;
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            obj.f49397f = str;
            obj.h = str.hashCode();
            return obj;
        } else {
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j3 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                obj.f49398g = j3;
                obj.h = j3;
            }
            return obj;
        }
    }

    public static o0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        ?? obj = new Object();
        boolean z10 = true;
        obj.f49395b = true;
        long j3 = tL_availableEffect.f18367id;
        obj.f49396c = j3;
        if (tL_availableEffect.effect_animation_id != 0) {
            z10 = false;
        }
        obj.e = z10;
        obj.f49398g = tL_availableEffect.effect_sticker_id;
        obj.h = j3;
        obj.d = tL_availableEffect.premium_required;
        obj.f49397f = tL_availableEffect.emoticon;
        return obj;
    }

    public final o0 a() {
        String findAnimatedEmojiEmoticon;
        long j3 = this.f49398g;
        if (j3 != 0 && (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(q5.f(UserConfig.selectedAccount, j3), null)) != null) {
            return b(findAnimatedEmojiEmoticon);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o0.class == obj.getClass()) {
            o0 o0Var = (o0) obj;
            if (this.f49398g == o0Var.f49398g && Objects.equals(this.f49397f, o0Var.f49397f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(TLRPC.Reaction reaction) {
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.f49397f);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != this.f49398g) {
            return false;
        }
        return true;
    }

    public final TLRPC.Reaction g() {
        if (this.f49394a) {
            return new TLRPC.TL_reactionPaid();
        }
        if (this.f49397f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = this.f49397f;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = this.f49398g;
        return tL_reactionCustomEmoji;
    }

    public final int hashCode() {
        return Objects.hash(this.f49397f, Long.valueOf(this.f49398g));
    }

    public final String toString() {
        TLRPC.Document f7;
        if (!TextUtils.isEmpty(this.f49397f)) {
            return this.f49397f;
        }
        long j3 = this.f49398g;
        if (j3 != 0 && (f7 = q5.f(UserConfig.selectedAccount, j3)) != null) {
            return MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.f49398g);
        sb2.append(", ");
        return a4.a.t(sb2, this.f49397f, "}");
    }
}
