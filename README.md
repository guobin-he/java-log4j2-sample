java-log4j2-sample
------------------

* �ݒ���@
  * log4j2�̃_�E�����[�h
    * http://logging.apache.org/log4j/2.x/download.html ����ŐV��log4j2���_�E�����[�h���܂�
    * log4j-api-2.0-beta8.jar ��  log4j-core-2.0-beta8.jar ��lib�t�H���_�z���Ɉړ����܂��i�o�[�W�����̓_�E�����[�h�������Ƃ͈قȂ�\��������܂��j
    * ��L2�̃t�@�C�����N���X�p�X�ɒǉ����܂�
  * log4j2.xml�̔z�u
    * src �z���ɔz�u���܂�
    * src�����̓f�t�H���g�ŃN���X�p�X���ʂ��Ă���p�X�ɂȂ��Ă��܂�
* ����
  * log4j2.xml �� log4j2.json ��2�v���p�e�B�t�@�C���œ��e�𑀍�ł��܂�
  * log4j.properties �͂Ȃ����Ă݂����ł��A�܂�log4j��log4j2�ƃt�@�C�����̋K�����ς���Ă��܂�
  * �f�t�H���g�Ńv���p�e�B�t�@�C�����K�v�Ȃ��Ȃ�܂��������O���x����error�ɂȂ��Ă��܂�
  * TRACE < DEBUG < INFO < WARN < ERROR < FATAL �̏��Ń��O���x���͐ݒ�ł��܂��i�f�t�H���g��ERROR��FATAL�̂ݕ\������܂��j
    * http://logging.apache.org/log4j/2.x/manual/architecture.html
  * �w��ł���o�̓t�H�[�}�b�g
    * http://logging.apache.org/log4j/2.x/manual/layouts.html
  * �^�O
    * appenders
      * �R���\�[���ɏo�͂���t�H�[�}�b�g�ƃt�@�C���ɏo�͂���t�H�[�}�b�g���`���܂�
      * �w��ł���appenders�ꗗ
        * http://logging.apache.org/log4j/2.x/manual/appenders.html
      * RollingFileAppender
        * http://logging.apache.org/log4j/2.x/manual/appenders.html#RollingFileAppender
    * loggers
      * �J�e�S�����`���܂�
      * �J�e�S���͂ǂ�appenders���g�������w�肷�邱�ƂŃ��O�̏o�͕��������肵�܂�    