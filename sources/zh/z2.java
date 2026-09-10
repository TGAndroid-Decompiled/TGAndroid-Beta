package zh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import bi.r9;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.i41;
public final class z2 {
    public TL_stories.StoryItem f49129a = null;
    public h5 f49130b = null;
    public TL_stories.StoryItem f49131c;
    public boolean d;
    public boolean e;
    public boolean f49132f;
    public boolean f49133g;
    public CharSequence h;
    public j6 f49134i;
    public j6 f49135j;
    public final a3 f49136k;

    public z2(a3 a3Var) {
        this.f49136k = a3Var;
    }

    public static String c(z2 z2Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = z2Var.f49129a;
        if (storyItem != null && (messageMedia = storyItem.media) != null) {
            if (messageMedia.photo != null) {
                StringBuilder sb2 = new StringBuilder("photo#");
                sb2.append(z2Var.f49129a.media.photo.f17219id);
                sb2.append("at");
                return a4.a.n(z2Var.f49129a.media.photo.dc_id, "dc", sb2);
            } else if (messageMedia.document != null) {
                StringBuilder sb3 = new StringBuilder("doc#");
                sb3.append(z2Var.f49129a.media.document.f17201id);
                sb3.append("at");
                return a4.a.n(z2Var.f49129a.media.document.dc_id, "dc", sb3);
            } else {
                return "unknown";
            }
        } else if (z2Var.f49130b != null) {
            return "uploading from " + z2Var.f49130b.e;
        } else {
            return "unknown";
        }
    }

    public final boolean d() {
        h5 h5Var = this.f49130b;
        if (h5Var != null) {
            return h5Var.f48473c.H0;
        }
        TL_stories.StoryItem storyItem = this.f49129a;
        if (storyItem != null) {
            if (storyItem.noforwards) {
                return false;
            }
            if (storyItem.pinned) {
                TLRPC.Chat chat = MessagesController.getInstance(this.f49136k.C2).getChat(Long.valueOf(-storyItem.dialogId));
                if (chat != null && chat.noforwards) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final String e() {
        a3 a3Var = this.f49136k;
        if (a3Var.O1.f49129a == null) {
            return null;
        }
        if (a3Var.B1 > 0) {
            TLRPC.User user = MessagesController.getInstance(a3Var.C2).getUser(Long.valueOf(a3Var.B1));
            if (UserObject.getPublicUsername(user) == null) {
                return null;
            }
            if (a3Var.O1.f49132f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", UserObject.getPublicUsername(user));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", UserObject.getPublicUsername(user), Integer.valueOf(a3Var.O1.f49129a.f17435id));
        }
        TLRPC.Chat chat = MessagesController.getInstance(a3Var.C2).getChat(Long.valueOf(-a3Var.B1));
        if (ChatObject.getPublicUsername(chat) == null) {
            return null;
        }
        if (a3Var.O1.f49132f) {
            return String.format(Locale.US, "https://t.me/%1$s/s/live", ChatObject.getPublicUsername(chat));
        }
        return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", ChatObject.getPublicUsername(chat), Integer.valueOf(a3Var.O1.f49129a.f17435id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.f49129a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final j6 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.f49134i == null && (storyItem = this.f49129a) != null) {
            TLRPC.Document document = storyItem.music;
            j6 j6Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeAudio.class)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    j6Var = new j6();
                    j6Var.f48546f = true;
                    j6Var.f48547g = document;
                    if (TextUtils.isEmpty(str)) {
                        j6Var.f48550k = new SpannableStringBuilder(j6.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        j6Var.f48550k = new SpannableStringBuilder(j6.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(j6.d()).append((CharSequence) " ").append((CharSequence) str2);
                        j6Var.f48550k = append;
                        int length = append.length();
                        j6Var.f48550k.append((CharSequence) " ・ ");
                        j6Var.f48550k.setSpan(new CharacterStyle(), length, j6Var.f48550k.length(), 33);
                        j6Var.f48550k.append((CharSequence) str);
                    }
                }
            }
            this.f49134i = j6Var;
        }
        return this.f49134i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.f49129a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            a3 a3Var = this.f49136k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                return FileLoader.getInstance(a3Var.C2).getPathToAttach(this.f49129a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.f49129a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, Integer.MAX_VALUE);
                File pathToAttach = FileLoader.getInstance(a3Var.C2).getPathToAttach(closestPhotoSizeWithSize, true);
                if (!pathToAttach.exists()) {
                    return FileLoader.getInstance(a3Var.C2).getPathToAttach(closestPhotoSizeWithSize, false);
                }
                return pathToAttach;
            }
            return null;
        }
        return null;
    }

    public final j6 i() {
        ArrayList arrayList;
        TLRPC.Chat chat;
        CharSequence groupSpan;
        TLRPC.Chat chat2;
        CharSequence groupSpan2;
        CharSequence groupSpan3;
        String str;
        if (this.f49135j == null) {
            TL_stories.StoryItem storyItem = this.f49129a;
            int i10 = 0;
            j6 j6Var = null;
            if (storyItem != null) {
                int i11 = this.f49136k.C2;
                if (storyItem.fwd_from != null) {
                    j6Var = new j6();
                    j6Var.f48543a = i11;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        j6Var.f48544b = Long.valueOf(peerDialogId);
                        if (peerDialogId >= 0) {
                            j6Var.f48550k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId))));
                        } else {
                            TLRPC.Chat chat3 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
                            if (ChatObject.isChannelAndNotMegaGroup(chat3)) {
                                groupSpan3 = MessageObject.channelSpan();
                            } else {
                                groupSpan3 = MessageObject.groupSpan();
                            }
                            SpannableStringBuilder append = new SpannableStringBuilder(groupSpan3).append((CharSequence) " ");
                            if (chat3 != null) {
                                str = chat3.title;
                            } else {
                                str = "";
                            }
                            j6Var.f48550k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        j6Var.f48550k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    j6Var.f48546f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        j6Var.f48545c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    j6Var.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (i10 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(i10);
                        }
                        i10++;
                    }
                    if (tL_mediaAreaChannelPost != null && (chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        j6Var = new j6();
                        j6Var.f48544b = Long.valueOf(-chat2.f17195id);
                        j6Var.e = true;
                        j6Var.f48543a = i11;
                        j6Var.f48546f = true;
                        j6Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            groupSpan2 = MessageObject.channelSpan();
                        } else {
                            groupSpan2 = MessageObject.groupSpan();
                        }
                        j6Var.f48550k = new SpannableStringBuilder(groupSpan2).append((CharSequence) " ").append((CharSequence) chat2.title);
                    }
                }
                this.f49135j = j6Var;
            } else {
                h5 h5Var = this.f49130b;
                if (h5Var != null) {
                    r9 r9Var = h5Var.f48473c;
                    if (r9Var != null) {
                        if (r9Var.f3586n) {
                            j6Var = new j6();
                            j6Var.f48550k = r9Var.f3590p;
                            String str2 = r9Var.f3596s;
                            j6Var.f48551l = str2;
                            j6Var.f48546f = TextUtils.isEmpty(str2);
                        } else if (r9Var.f3600u && (arrayList = r9Var.v) != null && arrayList.size() > 0) {
                            MessageObject messageObject = (MessageObject) r9Var.v.get(0);
                            long p5 = r9.p(messageObject);
                            if (p5 < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-p5))) != null) {
                                j6Var = new j6();
                                j6Var.f48544b = Long.valueOf(p5);
                                j6Var.e = true;
                                j6Var.f48543a = messageObject.currentAccount;
                                j6Var.f48546f = true;
                                Boolean D = r9.D(messageObject);
                                if (D != null) {
                                    if (D.booleanValue()) {
                                        i10 = messageObject.messageOwner.fwd_from.channel_post;
                                    } else {
                                        i10 = messageObject.getId();
                                    }
                                }
                                j6Var.d = Integer.valueOf(i10);
                                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                    groupSpan = MessageObject.channelSpan();
                                } else {
                                    groupSpan = MessageObject.groupSpan();
                                }
                                j6Var.f48550k = new SpannableStringBuilder(groupSpan).append((CharSequence) " ").append((CharSequence) chat.title);
                            }
                        }
                    }
                    this.f49135j = j6Var;
                }
            }
        }
        return this.f49135j;
    }

    public final boolean j() {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.f49129a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }
        h5 h5Var = this.f49130b;
        if (h5Var == null) {
            return true;
        }
        return !h5Var.f48473c.Y;
    }

    public final boolean k(long j3) {
        TL_stories.StoryItem storyItem = this.f49129a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j3 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.f17212id) {
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
        h5 h5Var = this.f49130b;
        if (h5Var != null) {
            return h5Var.f48477s;
        }
        TL_stories.StoryItem storyItem = this.f49129a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.f49129a.media.getDocument();
            if (!MessageObject.isVideoDocument(document) && !"video/mp4".equals(document.mime_type)) {
                return false;
            }
            return true;
        }
        TL_stories.StoryItem storyItem2 = this.f49129a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        this.f49129a = storyItem;
        this.f49135j = null;
        this.f49134i = null;
        this.f49130b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.e = m();
        TL_stories.StoryItem storyItem2 = this.f49129a;
        if (storyItem2 != null && (messageMedia = storyItem2.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49132f = z10;
    }

    public final void o() {
        SpannableStringBuilder valueOf;
        int i10 = 0;
        this.f49133g = false;
        a3 a3Var = this.f49136k;
        l2 l2Var = a3Var.K0;
        z2 z2Var = a3Var.O1;
        h5 h5Var = z2Var.f49130b;
        if (h5Var != null) {
            CharSequence charSequence = h5Var.f48473c.C0;
            this.h = charSequence;
            CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, l2Var.f48778b0.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji;
            if (replaceEmoji == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(replaceEmoji);
            }
            TLRPC.User user = MessagesController.getInstance(a3Var.C2).getUser(Long.valueOf(a3Var.B1));
            if (a3Var.B1 < 0 || MessagesController.getInstance(a3Var.C2).storyEntitiesAllowed(user)) {
                MessageObject.addLinks(true, valueOf);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = z2Var.f49129a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, i41.A())) {
                this.f49133g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = z2Var.f49129a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence replaceEmoji2 = Emoji.replaceEmoji(str, l2Var.f48778b0.getPaint().getFontMetricsInt(), false);
                this.h = replaceEmoji2;
                if (replaceEmoji2 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, l2Var.f48778b0.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf2, l2Var.f48778b0.getPaint().getFontMetricsInt(), false));
                    i10 = (a3Var.B1 < 0 || MessagesController.getInstance(a3Var.C2).storyEntitiesAllowed(MessagesController.getInstance(a3Var.C2).getUser(Long.valueOf(a3Var.B1)))) ? 1 : 1;
                    if (i10 != 0) {
                        MessageObject.addLinks(true, valueOf2);
                    }
                    MessageObject.addEntitiesToText(valueOf2, tL_textWithEntities.entities, false, true, true, false, i10 ^ 1);
                    this.h = valueOf2;
                    return;
                }
                return;
            }
            String str2 = z2Var.f49129a.caption;
            this.h = str2;
            CharSequence replaceEmoji3 = Emoji.replaceEmoji(str2, l2Var.f48778b0.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji3;
            if (replaceEmoji3 != null && z2Var.f49129a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(z2Var.f49129a.caption), z2Var.f49129a.entities, l2Var.f48778b0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf3, l2Var.f48778b0.getPaint().getFontMetricsInt(), false));
                i10 = (a3Var.B1 < 0 || MessagesController.getInstance(a3Var.C2).storyEntitiesAllowed(MessagesController.getInstance(a3Var.C2).getUser(Long.valueOf(a3Var.B1)))) ? 1 : 1;
                if (i10 != 0) {
                    MessageObject.addLinks(true, valueOf3);
                }
                MessageObject.addEntitiesToText(valueOf3, z2Var.f49129a.entities, false, true, true, false, i10 ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
