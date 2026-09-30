package s3;

import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f42922a;
    public final long f42923b;
    public final List f42924c;

    public d(long j3, long j10, List list) {
        this.f42922a = j3;
        this.f42923b = j10;
        this.f42924c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f42922a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return a4.a.s(sb2, this.f42923b, " }");
    }
}
