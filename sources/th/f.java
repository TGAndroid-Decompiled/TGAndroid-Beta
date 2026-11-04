package th;

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class f {
    public final TLRPC.TL_messageMediaPoll f55419a;
    public final TLRPC.TL_inputMediaPoll f55420b;
    public final long f55421c;
    public final String d;
    public final ArrayList f55422e;

    public f(d dVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, long j10, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f55421c = j10;
        this.d = str;
        this.f55422e = arrayList;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        tL_poll.f27027id = poll.f27027id;
        tL_poll.flags = poll.flags;
        tL_poll.closed = poll.closed;
        tL_poll.public_voters = poll.public_voters;
        tL_poll.multiple_choice = poll.multiple_choice;
        tL_poll.open_answers = poll.open_answers;
        tL_poll.revoting_disabled = poll.revoting_disabled;
        tL_poll.shuffle_answers = poll.shuffle_answers;
        tL_poll.subscribers_only = poll.subscribers_only;
        tL_poll.countries_iso2 = poll.countries_iso2;
        tL_poll.hide_results_until_close = poll.hide_results_until_close;
        tL_poll.creator = poll.creator;
        tL_poll.quiz = poll.quiz;
        tL_poll.answers = new ArrayList<>(tL_messageMediaPoll.poll.answers);
        ArrayList<TLRPC.PollAnswer> arrayList3 = tL_messageMediaPoll.poll.answers;
        int size = arrayList3.size();
        int i3 = 0;
        while (i3 < size) {
            TLRPC.PollAnswer pollAnswer = arrayList3.get(i3);
            i3++;
            new TLRPC.TL_inputPollAnswer().text = pollAnswer.text;
        }
        TLRPC.Poll poll2 = tL_inputMediaPoll.poll;
        TLRPC.Poll poll3 = tL_messageMediaPoll.poll;
        poll2.question = poll3.question;
        poll2.close_period = poll3.close_period;
        poll2.close_date = poll3.close_date;
        poll2.hash = poll3.hash;
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !TextUtils.isEmpty(pollResults.solution)) {
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            tL_inputMediaPoll.solution = pollResults2.solution;
            tL_inputMediaPoll.solution_entities = pollResults2.solution_entities;
            tL_inputMediaPoll.flags |= 2;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            tL_inputMediaPoll.correct_answers = new ArrayList<>(arrayList2);
            tL_inputMediaPoll.flags |= 1;
        }
        if (dVar != null) {
            SparseArray sparseArray = dVar.f55399a;
            int size2 = sparseArray.size();
            for (int i10 = 0; i10 < size2; i10++) {
                int keyAt = sparseArray.keyAt(i10);
                c cVar = (c) sparseArray.valueAt(i10);
                if (cVar instanceof uh.e) {
                    TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                    tL_inputMediaWebPage.url = ((uh.e) cVar).f56357b;
                    tL_inputMediaWebPage.optional = true;
                    d.k(tL_inputMediaPoll, keyAt, tL_inputMediaWebPage);
                } else if (cVar instanceof uh.f) {
                    d.k(tL_inputMediaPoll, keyAt, dg.d.h(((uh.f) cVar).f56364b));
                } else if (cVar instanceof uh.h) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((uh.h) cVar).f56367b;
                    tL_inputDocument.f27013id = document.f27007id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.f27062id = tL_inputDocument;
                    d.k(tL_inputMediaPoll, keyAt, tL_inputMediaDocument);
                }
            }
            int size3 = sparseArray.size();
            for (int i11 = 0; i11 < size3; i11++) {
                int keyAt2 = sparseArray.keyAt(i11);
                c cVar2 = (c) sparseArray.valueAt(i11);
                if (cVar2 instanceof uh.e) {
                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
                    tL_messageMediaWebPage.webpage = tL_webPage;
                    String str2 = ((uh.e) cVar2).f56357b;
                    tL_webPage.display_url = str2;
                    tL_webPage.url = str2;
                    d.l(tL_messageMediaPoll, keyAt2, tL_messageMediaWebPage);
                } else if (cVar2 instanceof uh.f) {
                    d.l(tL_messageMediaPoll, keyAt2, ((uh.f) cVar2).f56364b);
                } else if (cVar2 instanceof uh.h) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_messageMediaDocument.document = ((uh.h) cVar2).f56367b;
                    d.l(tL_messageMediaPoll, keyAt2, tL_messageMediaDocument);
                }
            }
        }
        this.f55419a = tL_messageMediaPoll;
        this.f55420b = tL_inputMediaPoll;
    }
}
