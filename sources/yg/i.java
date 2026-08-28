package yg;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import g7.z7;
import j3.r0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public abstract class i {
    public static int a(MessageObject messageObject) {
        long dialogId;
        int i9;
        int i10 = 0;
        if (messageObject.type != 17) {
            return 0;
        }
        TLRPC.Message message = messageObject.messageOwner;
        int i11 = messageObject.currentAccount;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(message, TLRPC.TL_messageMediaPoll.class);
        if (tL_messageMediaPoll == null) {
            return 0;
        }
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        if (poll.closed) {
            i10 = 8;
        }
        if (poll.subscribers_only) {
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            if (messageFwdHeader != null) {
                dialogId = DialogObject.getPeerDialogId(messageFwdHeader.from_id);
            } else {
                dialogId = messageObject.getDialogId();
            }
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialogId));
            if (chat != null) {
                if (chat.left || chat.kicked) {
                    i10 |= 1;
                }
                TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                if (messageFwdHeader2 != null) {
                    i9 = messageFwdHeader2.date;
                } else {
                    i9 = message.date;
                }
                if (i9 - chat.date < 86400) {
                    i10 |= 2;
                }
            }
        }
        ArrayList<String> arrayList = tL_messageMediaPoll.poll.countries_iso2;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (!tL_messageMediaPoll.poll.countries_iso2.contains(MessagesController.getInstance(i11).config.phoneCountryIso2.get())) {
                return i10 | 4;
            }
        }
        return i10;
    }

    public static SpannableStringBuilder b(MessageObject messageObject, int i9) {
        long dialogId;
        int i10;
        int i11;
        if (messageObject.type == 17) {
            TLRPC.Message message = messageObject.messageOwner;
            int i12 = messageObject.currentAccount;
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(message, TLRPC.TL_messageMediaPoll.class);
            if (tL_messageMediaPoll != null) {
                if (z7.a(i9, 4)) {
                    ArrayList arrayList = new ArrayList(tL_messageMediaPoll.poll.countries_iso2.size());
                    ArrayList<String> arrayList2 = tL_messageMediaPoll.poll.countries_iso2;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        String str = arrayList2.get(i13);
                        i13++;
                        String str2 = str;
                        String countryName = LocaleController.getCountryName(str2);
                        if (!TextUtils.isEmpty(countryName)) {
                            str2 = countryName;
                        }
                        arrayList.add(str2);
                    }
                    boolean z10 = tL_messageMediaPoll.poll.subscribers_only;
                    if (arrayList.size() == 1) {
                        if (z10) {
                            i11 = R.string.PollV2ToastOnlySubscribersFromCountriesCanVoteOne;
                        } else {
                            i11 = R.string.PollV2ToastOnlyUsersFromCountriesCanVoteOne;
                        }
                        return AndroidUtilities.replaceTags(LocaleController.formatString(i11, arrayList.get(0)));
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i14 = 0; i14 < arrayList.size() - 1; i14++) {
                        if (stringBuffer.length() > 0) {
                            stringBuffer.append(", ");
                        }
                        stringBuffer.append((String) arrayList.get(i14));
                    }
                    if (z10) {
                        i10 = R.string.PollV2ToastOnlySubscribersFromCountriesCanVoteOther;
                    } else {
                        i10 = R.string.PollV2ToastOnlyUsersFromCountriesCanVoteOther;
                    }
                    return AndroidUtilities.replaceTags(LocaleController.formatString(i10, stringBuffer, r0.j(1, arrayList)));
                } else if (z7.a(i9, 1)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    if (messageFwdHeader != null) {
                        dialogId = DialogObject.getPeerDialogId(messageFwdHeader.from_id);
                    } else {
                        dialogId = messageObject.getDialogId();
                    }
                    return AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2ToastOnlySubscribersCanVote, DialogObject.getShortName(MessagesController.getInstance(i12).getChat(Long.valueOf(-dialogId)))));
                } else if (z7.a(i9, 2)) {
                    return AndroidUtilities.replaceTags(LocaleController.getString(R.string.PollV2ToastOnlySubscribersJoined24hCanVote));
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }
}
