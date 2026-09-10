package zh;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import java.net.URLDecoder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.z51;
import org.telegram.ui.eo;
public final class l2 extends p6 {
    public final u7 f48637x0;
    public final org.telegram.ui.ActionBar.f6 f48638y0;
    public final a3 f48639z0;

    public l2(a3 a3Var, Context context, b bVar, u7 u7Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, bVar);
        this.f48639z0 = a3Var;
        this.f48637x0 = u7Var;
        this.f48638y0 = f6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.y5 y5Var) {
        if (y5Var != null) {
            a3 a3Var = this.f48639z0;
            if (a3Var.Q1 != null) {
                TLRPC.Document document = y5Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.p5.f(a3Var.C2, y5Var.documentId);
                }
                if (document != null) {
                    h2 h2Var = a3Var.f48160c1;
                    org.telegram.ui.ActionBar.f6 f6Var = this.f48638y0;
                    pc h = new wc(h2Var, f6Var).h(document, 2, new org.telegram.ui.Components.h7(this, this.f48637x0, f6Var, 9));
                    if (h != null) {
                        h.f26075a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof c61;
        u7 u7Var = this.f48637x0;
        a3 a3Var = this.f48639z0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(a3Var.C2).getUser(Utilities.parseLong(((c61) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(a3Var.C2).openChatOrProfileWith(user, null, u7Var.f48931f, 0, false);
            }
        } else if (characterStyle instanceof z51) {
            String url = ((z51) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    u7Var.H(new l40(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                u7Var.H(new la0(bundle, null));
                return;
            }
            String b10 = nf.f.b(url);
            if (b10 != null) {
                String lowerCase = b10.toLowerCase();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(a3Var.C2).openByUserName(lowerCase, u7Var.f48931f, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof b61);
        } else if (characterStyle instanceof y51) {
            y51 y51Var = (y51) characterStyle;
            AndroidUtilities.addToClipboard(y51Var.f29250a.subSequence(y51Var.f29251b, y51Var.f29252c).toString());
            em.o(R.string.TextCopied, new wc(a3Var.f48160c1, this.f48638y0));
        } else if (characterStyle instanceof ClickableSpan) {
            ((ClickableSpan) characterStyle).onClick(view);
        }
    }

    @Override
    public final void H(final URLSpan uRLSpan, final View view, k5 k5Var) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = nf.f.v(parse, null, null, nf.f.a(parse.getHost()), null);
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
            }
            str = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e7) {
            FileLog.e(e7);
            str = url2;
        }
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.f48638y0;
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, context, f6Var, false);
        h3Var.fixNavigationBar();
        h3Var.title = str;
        h3Var.bigTitle = false;
        h3Var.multipleLinesTitle = true;
        a3 a3Var = this.f48639z0;
        z2 z2Var = a3Var.O1;
        CharSequence[] charSequenceArr = (z2Var == null || z2Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.f6 f6Var2 = this.f48638y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                l2 l2Var = l2.this;
                if (i10 == 0) {
                    l2Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new wc(l2Var.f48639z0.f48160c1, f6Var2).k(false).j();
                }
            }
        };
        h3Var.items = charSequenceArr;
        h3Var.onClickListener = onClickListener;
        h3Var.setOnHideListener(new gg.o(k5Var, 13));
        h3Var.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, f6Var));
        ((l7) a3Var.Q1).h(h3Var);
    }

    @Override
    public final void I(j6 j6Var) {
        if (j6Var == null) {
            return;
        }
        final TLRPC.Document document = j6Var.f48547g;
        a3 a3Var = this.f48639z0;
        u7 u7Var = this.f48637x0;
        final org.telegram.ui.ActionBar.f6 f6Var = this.f48638y0;
        if (document != null) {
            w70 F = w70.F(u7Var.v, f6Var, a3Var.K0);
            F.f28683i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) {
                public final l2 f48490b;

                {
                    this.f48490b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            a3 a3Var2 = this.f48490b.f48639z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(a3Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(a3Var2.C2).getClientUserId();
                            z2 z2Var = a3Var2.O1;
                            if (z2Var != null) {
                                storyItem = z2Var.f49129a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new wc(a3Var2.f48160c1, f6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new bi.f0(20))).k(true);
                            return;
                        default:
                            a3 a3Var3 = this.f48490b.f48639z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f17223id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f17207id = document2.f17201id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(a3Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(a3Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new wc(a3Var3.f48160c1, f6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) {
                public final l2 f48490b;

                {
                    this.f48490b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            a3 a3Var2 = this.f48490b.f48639z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(a3Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(a3Var2.C2).getClientUserId();
                            z2 z2Var = a3Var2.O1;
                            if (z2Var != null) {
                                storyItem = z2Var.f49129a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new wc(a3Var2.f48160c1, f6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new bi.f0(20))).k(true);
                            return;
                        default:
                            a3 a3Var3 = this.f48490b.f48639z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f17223id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f17207id = document2.f17201id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(a3Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(a3Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new wc(a3Var3.f48160c1, f6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (j6Var.e && j6Var.f48544b != null && j6Var.d != null) {
            Bundle bundle = new Bundle();
            if (j6Var.f48544b.longValue() >= 0) {
                bundle.putLong("user_id", j6Var.f48544b.longValue());
            } else {
                bundle.putLong("chat_id", -j6Var.f48544b.longValue());
            }
            bundle.putInt("message_id", j6Var.d.intValue());
            u7Var.H(new eo(bundle));
        } else if (j6Var.f48544b != null && j6Var.f48545c != null) {
            MessagesController.getInstance(a3Var.C2).getStoriesController().d0(j6Var.f48544b.longValue(), j6Var.f48545c.intValue(), new sg.l0(this, j6Var, u7Var, f6Var, 1));
        } else {
            pc Q = new wc(a3Var.f48160c1, f6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
            Q.f26075a = 3;
            Q.k(true);
        }
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        boolean z11;
        b11 b11Var;
        if (!z10 && !AndroidUtilities.shouldShowUrlInAlert(str)) {
            if (i10 == 0) {
                nf.f.q(getContext(), Uri.parse(str), true, true, null);
                return;
            } else if (i10 == 1) {
                nf.f.q(getContext(), Uri.parse(str), false, false, null);
                return;
            } else if (i10 == 2) {
                nf.f.q(getContext(), Uri.parse(str), false, true, null);
                return;
            } else {
                return;
            }
        }
        u7 u7Var = this.f48637x0;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                org.telegram.ui.Components.d5.r0(u7Var.f48931f, str, true, true, false, false, null, null, this.f48638y0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof b61) && (b11Var = ((b61) characterStyle).f21735a) != null && (b11Var.f21677a & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.d5.r0(u7Var.f48931f, str, true, true, true, z11, null, null, this.f48638y0);
    }
}
