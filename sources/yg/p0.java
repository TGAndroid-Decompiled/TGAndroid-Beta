package yg;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p5;
public final class p0 {
    public boolean f47098a;
    public boolean f47099b;
    public long f47100c;
    public boolean d;
    public boolean e;
    public String f47101f;
    public long f47102g;
    public long h;

    public static p0 b(String str) {
        if (str == null) {
            str = "";
        }
        ?? obj = new Object();
        if (str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                obj.f47102g = parseLong;
                obj.h = parseLong;
                return obj;
            } catch (Exception unused) {
                obj.f47101f = str;
                obj.h = str.hashCode();
                return obj;
            }
        }
        obj.f47101f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static p0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        ?? obj = new Object();
        String str = tL_availableReaction.reaction;
        obj.f47101f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static p0 d(TLRPC.Reaction reaction) {
        ?? obj = new Object();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            obj.f47098a = true;
            return obj;
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            obj.f47101f = str;
            obj.h = str.hashCode();
            return obj;
        } else {
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j3 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                obj.f47102g = j3;
                obj.h = j3;
            }
            return obj;
        }
    }

    public static p0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        ?? obj = new Object();
        boolean z10 = true;
        obj.f47099b = true;
        long j3 = tL_availableEffect.f17226id;
        obj.f47100c = j3;
        if (tL_availableEffect.effect_animation_id != 0) {
            z10 = false;
        }
        obj.e = z10;
        obj.f47102g = tL_availableEffect.effect_sticker_id;
        obj.h = j3;
        obj.d = tL_availableEffect.premium_required;
        obj.f47101f = tL_availableEffect.emoticon;
        return obj;
    }

    public final p0 a() {
        String findAnimatedEmojiEmoticon;
        long j3 = this.f47102g;
        if (j3 != 0 && (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(p5.f(UserConfig.selectedAccount, j3), null)) != null) {
            return b(findAnimatedEmojiEmoticon);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p0.class == obj.getClass()) {
            p0 p0Var = (p0) obj;
            if (this.f47102g == p0Var.f47102g && Objects.equals(this.f47101f, p0Var.f47101f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(TLRPC.Reaction reaction) {
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.f47101f);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != this.f47102g) {
            return false;
        }
        return true;
    }

    public final TLRPC.Reaction g() {
        if (this.f47098a) {
            return new TLRPC.TL_reactionPaid();
        }
        if (this.f47101f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = this.f47101f;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = this.f47102g;
        return tL_reactionCustomEmoji;
    }

    public final int hashCode() {
        return Objects.hash(this.f47101f, Long.valueOf(this.f47102g));
    }

    public final String toString() {
        TLRPC.Document f7;
        if (!TextUtils.isEmpty(this.f47101f)) {
            return this.f47101f;
        }
        long j3 = this.f47102g;
        if (j3 != 0 && (f7 = p5.f(UserConfig.selectedAccount, j3)) != null) {
            return MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.f47102g);
        sb2.append(", ");
        return a4.a.s(sb2, this.f47101f, "}");
    }
}
