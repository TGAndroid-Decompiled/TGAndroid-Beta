package s3;

import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f45725a;
    public final long f45726b;
    public final List f45727c;

    public d(long j3, long j10, List list) {
        this.f45725a = j3;
        this.f45726b = j10;
        this.f45727c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f45725a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return a4.a.r(sb2, this.f45726b, " }");
    }
}
