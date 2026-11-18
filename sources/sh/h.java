package sh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import c8.dd;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n0;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLRPC;
public abstract class h {
    public static int a(fj fjVar) {
        TLRPC.MessageMedia messageMedia;
        long B0;
        int i7;
        int i10 = 0;
        if (fjVar.D == 17) {
            TLRPC.Message message = fjVar.f23965k;
            int i11 = fjVar.K1;
            TLRPC.MessageMedia n1 = fj.n1(message);
            if (TLRPC.TL_messageMediaPoll.class.isInstance(n1)) {
                messageMedia = (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(n1);
            } else {
                messageMedia = null;
            }
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            if (tL_messageMediaPoll != null) {
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                if (poll.closed) {
                    i10 = 8;
                }
                if (poll.subscribers_only) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    if (messageFwdHeader != null) {
                        B0 = n5.o(messageFwdHeader.from_id);
                    } else {
                        B0 = fj.B0(fjVar.f23965k);
                    }
                    TLRPC.Chat O0 = mp.u1(i11).O0(Long.valueOf(-B0));
                    if (O0 != null) {
                        if (O0.left || O0.kicked) {
                            i10 |= 1;
                        }
                        TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                        if (messageFwdHeader2 != null) {
                            i7 = messageFwdHeader2.date;
                        } else {
                            i7 = message.date;
                        }
                        if (i7 - O0.date < 86400) {
                            i10 |= 2;
                        }
                    }
                }
                ArrayList<String> arrayList = tL_messageMediaPoll.poll.countries_iso2;
                if (arrayList != null && !arrayList.isEmpty()) {
                    if (!tL_messageMediaPoll.poll.countries_iso2.contains(((n0) mp.u1(i11).A7.T.f15536b).f25871c)) {
                        return i10 | 4;
                    }
                }
                return i10;
            }
        }
        return 0;
    }

    public static SpannableStringBuilder b(int i7, fj fjVar) {
        TLRPC.MessageMedia messageMedia;
        long B0;
        int i10;
        int i11;
        if (fjVar.D == 17) {
            TLRPC.Message message = fjVar.f23965k;
            int i12 = fjVar.K1;
            TLRPC.MessageMedia n1 = fj.n1(message);
            if (TLRPC.TL_messageMediaPoll.class.isInstance(n1)) {
                messageMedia = (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(n1);
            } else {
                messageMedia = null;
            }
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            if (tL_messageMediaPoll != null) {
                if (dd.a(i7, 4)) {
                    ArrayList arrayList = new ArrayList(tL_messageMediaPoll.poll.countries_iso2.size());
                    ArrayList<String> arrayList2 = tL_messageMediaPoll.poll.countries_iso2;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        String str = arrayList2.get(i13);
                        i13++;
                        String str2 = str;
                        String i02 = gd.i0(2131750505, str2);
                        if (!TextUtils.isEmpty(i02)) {
                            str2 = i02;
                        }
                        arrayList.add(str2);
                    }
                    boolean z10 = tL_messageMediaPoll.poll.subscribers_only;
                    if (arrayList.size() == 1) {
                        if (z10) {
                            i11 = 2131746924;
                        } else {
                            i11 = 2131746921;
                        }
                        return g0.W2(gd.a0(null, null, i11, arrayList.get(0)));
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i14 = 0; i14 < arrayList.size() - 1; i14++) {
                        if (stringBuffer.length() > 0) {
                            stringBuffer.append(", ");
                        }
                        stringBuffer.append((String) arrayList.get(i14));
                    }
                    if (z10) {
                        i10 = 2131746923;
                    } else {
                        i10 = 2131746920;
                    }
                    return g0.W2(gd.a0(null, null, i10, stringBuffer, i5.c.h(1, arrayList)));
                } else if (dd.a(i7, 1)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    if (messageFwdHeader != null) {
                        B0 = n5.o(messageFwdHeader.from_id);
                    } else {
                        B0 = fj.B0(fjVar.f23965k);
                    }
                    return g0.W2(gd.a0(null, null, 2131746925, n5.u(mp.u1(i12).O0(Long.valueOf(-B0)))));
                } else if (dd.a(i7, 2)) {
                    return g0.W2(gd.M0(2131746922, null));
                }
            }
        }
        return null;
    }
}
